class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        
        //For every person we are adding the person whom they met and at what time
        Map<Integer, List<int[]>> graph = new HashMap<>();

        for(int[] meeting: meetings){
            int x = meeting[0], y = meeting[1], t = meeting[2];
            graph.computeIfAbsent(x, k->new ArrayList<>()).add(new int[]{t,y});
            graph.computeIfAbsent(y, k->new ArrayList<>()).add(new int[]{t,x});
        }

        //Creating an array to determine when the given person learns the secret at the earliest time
        int[] earliestTime = new int[n];
        Arrays.fill(earliestTime, Integer.MAX_VALUE);
        earliestTime[0] = 0;
        earliestTime[firstPerson] = 0;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        q.add(new int[]{firstPerson, 0});

        while(!q.isEmpty()){
            int[] personTime = q.poll();
            int person = personTime[0], time = personTime[1];

            for(int[] nextPersonTime: graph.getOrDefault(person, new ArrayList<>())){
                int t = nextPersonTime[0], nextPerson = nextPersonTime[1];
                if(t>=time && earliestTime[nextPerson] > t){
                    earliestTime[nextPerson] = t;
                    q.add(new int[]{nextPerson, t});
                }
            }
        }

        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(earliestTime[i] != Integer.MAX_VALUE){
                ans.add(i);
            }
        }

        return ans;
    }
}
