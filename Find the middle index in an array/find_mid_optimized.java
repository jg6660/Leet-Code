class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((sum - nums[i]) / 2.0 == leftSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
