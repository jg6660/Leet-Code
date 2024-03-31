class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmostSubarrays(nums, k) - atmostSubarrays(nums,k-1);   
    }

    private int atmostSubarrays(int[] nums, int k){
        int left=0, right=0, countOdd=0, totalCount = 0;
        for(right=0; right<nums.length; right++){
            if(nums[right]%2 == 1){
                countOdd++;
            }
            while(countOdd > k){
                if(nums[left]%2 == 1){
                    countOdd--;
                }
                left++;
            }

            totalCount += right-left+1;
        }

        return totalCount;
    }
}
