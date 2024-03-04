class Solution {

    class Task{
        int freq, lastUsed = -1;
        public Task(int f){
            freq = f;
        }
    }

    public int leastInterval(char[] tasks, int n) {
        if(n==0) { return tasks.length;}

        HashMap<Character, Task> map = new HashMap<>();

        for(char c: tasks){
            map.putIfAbsent(c,new Task(0));
            map.get(c).freq++;
        }

        PriorityQueue<Task> pq = new PriorityQueue<>((a,b) -> (b.freq-a.freq));
        pq.addAll(map.values());

        Queue<Task> cooling = new LinkedList<>();
        int count=0;

        while( !cooling.isEmpty() || !pq.isEmpty()){
            //if no tasks are available at schedule at current time, go idle until the first cooling task becomes available
            if(pq.isEmpty()) count = cooling.peek().lastUsed + n +1;

            //Add any tasks in cooling that just became available for scheduling
            while(!cooling.isEmpty() && count>cooling.peek().lastUsed + n){
                pq.add(cooling.poll());
            }

            //Schedule the most occuring task by polling priority queue
            Task t = pq.poll();
            t.lastUsed = count++;
            t.freq--;

            //Add the task back into cooling if there are more instances of it
            if(t.freq != 0){ cooling.add(t);}
        }

        return count;
    }
}
