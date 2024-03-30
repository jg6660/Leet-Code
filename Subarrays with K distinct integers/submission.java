class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subarraysWithAtmostKDistinct(nums, k) - subarraysWithAtmostKDistinct(nums,k-1);
    }

    public int subarraysWithAtmostKDistinct(int[] nums, int k){
        int left = 0;
        HashMap<Integer, Integer> counter = new HashMap<>();
        int count = 0;

        for(int right=0; right<nums.length; right++){
            counter.put(nums[right], counter.getOrDefault(nums[right], 0)+1);

            while(counter.size()>k){
                counter.put(nums[left], counter.get(nums[left])-1);
                if(counter.get(nums[left]) == 0){
                    counter.remove(nums[left]);
                }
                left++;
            }

            count += (right-left+1);
        }

        return count;
    }
}
