class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        int temp;
        for(int k = nums.length-1 ; k>=0; k--){
            if(nums[k] != 0){
                temp = nums[k];
                break; 
            }
        }
        for(int i=0;i<nums.length; i++){
            if(nums[i]!=0){
                nums[j++] = nums[i];
            }
        }
        for(int i=j; i<nums.length;i++){
            nums[i] = 0;
        }
        
    }
}
