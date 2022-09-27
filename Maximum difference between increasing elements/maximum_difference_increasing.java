class Solution {
    public int maximumDifference(int[] nums) {
        int max=-1;
        int s=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<s){
                s=nums[i];
            }else if(nums[i]>s){
                max=Math.max(max,nums[i]-s);
            }
        }
        return max;
    }
}
