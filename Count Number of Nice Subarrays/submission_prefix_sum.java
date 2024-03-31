class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return prefixSum(nums, k);   
    }

    private int prefixSum(int[] nums, int k){
        int oddCount=0, totalCount = 0;
        HashMap<Integer, Integer> count = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i]%2 == 1){
                oddCount++;
            }

            if(oddCount == k){
                totalCount++;
            }

            int req = oddCount - k;
            if(count.containsKey(req)){
                totalCount += count.get(req);
            }

            count.put(oddCount, count.getOrDefault(oddCount, 0)+1);
        }

        return totalCount;
    }
}
