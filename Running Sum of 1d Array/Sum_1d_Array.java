class Solution {
    public int[] runningSum(int[] nums) {
     int[] summation = new int[nums.length];
         for(int i=0;i<nums.length;i++)
         {
             for(int k=0;k<=i;k++)
             {
                 summation[i]+=nums[k];
             }
         }
        return summation;
    }
}
