class Solution {
    public int findMiddleIndex(int[] nums) {
        int left_sum = 0;
        int right_sum = 0;
        for(int i =0;i<nums.length;i++){
            for(int l=0;l<i;l++){
                left_sum+=nums[l];
            }
            for(int r=i+1;r<nums.length;r++){
                right_sum+=nums[r];
            }
            if(left_sum==right_sum)
                return i;
            left_sum = 0;
            right_sum = 0;    
        }
        return -1;
    }
}
