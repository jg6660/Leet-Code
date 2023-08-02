class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList();
        HashMap<String, List> solution = new HashMap<String, List>();

        for(String str: strs){
            char[] res = str.toCharArray();
            Arrays.sort(res);
            String res1 = String.valueOf(res);
            if(!solution.containsKey(res1)){
                solution.put(res1, new ArrayList());
            }
            solution.get(res1).add(str);
        }

        return new ArrayList(solution.values());
    }
}
