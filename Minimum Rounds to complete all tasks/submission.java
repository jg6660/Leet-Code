class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> counter = new HashMap<>();
         int result = 0;

        for(int task: tasks){
            counter.put(task, counter.getOrDefault(task,0)+1);
        }

        for(int c: counter.values()){
            if(c==1){
                return -1;
            }
            result += Math.ceil((double)c/3);
        }

        return result;
    }
}
