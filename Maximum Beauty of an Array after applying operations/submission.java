class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0, j=0;

        for(j=0; j<nums.length; ++j){
            if(nums[j]-nums[i]>2*k) i++;
        }

        return j-i;
    }
}
