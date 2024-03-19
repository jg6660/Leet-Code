class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
       // Solved based on prefix sum
        HashMap<Integer, Integer> store = new HashMap<>();

        int prefixSum =0, maxLen = 0;

        for(int i=0; i<nums.length; i++){
            prefixSum += nums[i];

            if(prefixSum == k){
                maxLen = i+1;
            }

            // If any subarray seen so far sums to k, then
            // update the length of the longest_subarray. 
            if(store.containsKey(prefixSum-k)){
                maxLen = Math.max(maxLen, i-store.get(prefixSum-k));
            }

            if(!store.containsKey(prefixSum)){
                store.put(prefixSum, i);
            }
        }

        return maxLen;
    }
}

 
