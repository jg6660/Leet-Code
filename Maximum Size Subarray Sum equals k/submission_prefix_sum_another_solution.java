class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0, -1);
        int csum = 0;
        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++){
            csum += nums[i];
            int toget = csum - k;
            if(mp.containsKey(toget)){
                ans = Math.max(ans , i - mp.get(toget));
            }
            mp.put(csum, mp.getOrDefault(csum, i));
        }
        return ans;
    }
}
