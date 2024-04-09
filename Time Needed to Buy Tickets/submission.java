class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int time = 0;
        for(int i=0; i<tickets.length; i++){
            queue.add(i);
        }

        while(queue.size() != 0){
            int customer = queue.remove();
            tickets[customer]--;
            time++;
            System.out.println("customer " + customer + " tickets " + tickets[customer] + " time " + time);
            if(customer == k && tickets[customer] == 0){
                return time;
            }
            else if(tickets[customer] != 0){
                queue.add(customer);
            }
        }

        return -1;
    }
}
