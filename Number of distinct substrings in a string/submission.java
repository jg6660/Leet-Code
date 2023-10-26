class Solution {
    public int countDistinct(String s) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i < s.length() ; i++){
            for(int j = i; j < s.length(); j++){
                set.add(s.substring(i,j+1));
            }
        }
        return set.size();
    }
}
