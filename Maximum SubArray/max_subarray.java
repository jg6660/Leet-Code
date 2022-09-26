// Brute Force

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSubArray = -999999;
        for(int i=0;i<nums.length;i++)
        {
            int currentSubArray = 0;
            for(int j=i; j<nums.length;j++)
            {
                currentSubArray += nums[j];
                maxSubArray = Math.max(maxSubArray, currentSubArray);
            }
        }
        return maxSubArray;
    }
}

// Optimized method -> Kadane's Algorithm

class Solution {
    public int maxSubArray(int[] nums) {
      int currentSubArray = nums[0];
      int maxSubArray = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int num = nums[i];
            
            currentSubArray = Math.max(num, currentSubArray+num);
            maxSubArray = Math.max(maxSubArray, currentSubArray);
        }
        
    return maxSubArray;
}
}

