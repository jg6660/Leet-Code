class Solution {
    public void rotate(int[] nums, int k) {
        int[] nums_clone = new int[nums.length];
        for(int i=0;i<nums.length; i++){
            nums_clone[(i+k)%nums.length] = nums[i];
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = nums_clone[i];
        }
    }
}
