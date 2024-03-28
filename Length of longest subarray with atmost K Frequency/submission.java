class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int i = 0;
        int j = 0;
        int maxLen = 0;
        while(j<nums.length){
            count.put(nums[j], count.getOrDefault(nums[j],0)+1);
            while(count.get(nums[j])>k){
                count.put(nums[i], count.get(nums[i++])-1);
            }
            maxLen = Math.max(j-i+1, maxLen); 
            j++;
        }

        return maxLen;
    }
}
