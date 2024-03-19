class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> store = new HashMap<>();
        int count = 0, maxLen = 0;

         //Initialization
        store.put(0,-1);

        for(int i=0; i<nums.length; i++){
            count += (nums[i]==1 ? 1:-1);
            if(store.containsKey(count)){
                maxLen = Math.max(maxLen, i-store.get(count));
            } else{
                store.put(count, i);
            }
        }

        return maxLen;
    }
}
