class Solution {
    public int numDecodings(String s) {
        HashMap<Integer, Integer> dp = new HashMap<>();
        dp.put(s.length(),1);

        return dfs(s, 0, dp);
    }

    private int dfs(String s, int i, HashMap<Integer, Integer> dp){
        if(dp.containsKey(i)){
            return dp.get(i);
        }

        if(s.charAt(i) == '0'){
            return 0;
        }

        int res = dfs(s, i+1, dp);
        if (i + 1 < s.length() && (s.charAt(i) == '1' || s.charAt(i) == '2' && s.charAt(i + 1) <= '6')) {
            res += dfs(s, i + 2, dp);
        }

        dp.put(i, res);

        return res;
    }
}
