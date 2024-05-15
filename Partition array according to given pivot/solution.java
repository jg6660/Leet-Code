class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int l = nums.length;
        int[] ans = new int[l];
        int ans_l = 0;

        for (int i = 0; i < l; i++) {
            if (nums[i] < pivot) {
                ans[ans_l] = nums[i];
                ans_l++;
            }
        }
        for (int i = 0; i < l; i++) {
            if (nums[i] == pivot) {
                ans[ans_l] = nums[i];
                ans_l++;
            }
        }
        for (int i = 0; i < l; i++) {
            if (nums[i] > pivot) {
                ans[ans_l] = nums[i];
                ans_l++;
            }
        }

        return ans;
    }
}
