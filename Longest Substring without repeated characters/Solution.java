class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;

        Map<Character,Integer> maps = new HashMap<>();

        for(int j=0 , i=0; j<n;j++){
            if(maps.containsKey(s.charAt(j))){
                i = Math.max(i, maps.get(s.charAt(j)));
            }

            ans = Math.max(ans, j-i+1);
            maps.put(s.charAt(j), j+1);
        }

        return ans;
    }
}
