// Top Down Approach

class Solution {
    HashSet<Integer> isTravelNeeded = new HashSet<>();

    public int solve(int[] dp, int[] days, int[] costs, int currDay){

        //If we have iterated over travel days, we return 0;
        if(currDay > days[days.length-1]){
            return 0;
        }

        //If we don't need to travel on this day, we move on to next day
        if(!isTravelNeeded.contains(currDay)){
            return solve(dp, days, costs, currDay+1);
        }

        //If already calculated, return from here with the stored answer
        if(dp[currDay] != -1){
            return dp[currDay];
        }

        int oneDay = costs[0] + solve(dp, days, costs, currDay+1);
        int sevenDay = costs[1] + solve(dp, days, costs, currDay+7);
        int thirtyDay = costs[2] + solve(dp, days, costs, currDay+30);

        return dp[currDay] = Math.min(oneDay, Math.min(sevenDay, thirtyDay));
    }

    public int mincostTickets(int[] days, int[] costs) {
        int lastDay = days[days.length -1];
        int[] dp = new int[lastDay + 1];

        Arrays.fill(dp, -1);

        for(int day: days){
            isTravelNeeded.add(day);
        }

        return solve(dp, days, costs, 1);   
    }
}

// Time Complexity: O(k) where k is the last day present in days array
// Space Complexity: O(k)
