class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
       int maxLen = 0;
       for(int start =0; start<nums.length; start++){
            int sum = 0;
            for(int end = start; end<nums.length; end++){
                sum += nums[end];
                if(sum == k){
                    maxLen = Math.max(maxLen, end-start+1);
                }
            }
       }

       return maxLen;
    }
}


// Time limit exceeded
