class Solution {
    public int countHillValley(int[] nums) {
        int prevDiff = nums[1] - nums[0];
        int nextDiff = 0;
        int sum = 0;

        for(int i = 2; i < nums.length; i++) {
            nextDiff = nums[i] - nums[i - 1];
            if(nextDiff != 0) {
                if(nextDiff * prevDiff < 0) {
                    sum += 1;
                }
                prevDiff = nextDiff;
            }
        }

        return sum;

    }
}
