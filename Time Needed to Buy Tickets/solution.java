class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        
        for (int i = 0; i < tickets.length; i++) {
            // If the current person is before or at the desired person 'k'
            if (i <= k) {
                // Buy the minimum of tickets available at person 'k' and the current person
                time += Math.min(tickets[k], tickets[i]);
            } else {
                // If the current person is after 'k', buy the minimum of 
                // (tickets available at person 'k' - 1) and the current person
                time += Math.min(tickets[k] - 1, tickets[i]);
            }
        }
        
        return time;
    }
}


// Look into the solution description. Its really innovative.
