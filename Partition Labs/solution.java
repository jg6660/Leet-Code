class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastChar = new int[26];
        for(int i=0; i<s.length(); i++){
            lastChar[s.charAt(i) - 'a'] = i;
        }

        int j=0, anchor=0;
        List<Integer> solution = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            j = Math.max(j, lastChar[s.charAt(i)-'a']);
            if(i==j){
               solution.add(i-anchor+1);
               anchor = i+1;     
            }
        }

        return solution;
    }
}
