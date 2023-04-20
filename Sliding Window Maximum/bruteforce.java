class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int length = nums.length;

        int[] ans = new int[length-k+1];

        int max = Integer.MIN_VALUE;

        for(int i=0;i<length-k+1;i++){
            for(int j=0; j<k; j++){
                max = Math.max(max, nums[i+j]);
            }
            ans[i] = max;
            max = Integer.MIN_VALUE;
        }

        return ans;
    }
}
