class Solution {
    public int maxDepth(String s) {
        Stack<Character> store = new Stack<>();
        int maxDepth = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ')' && store.peek() == '('){
                store.pop();
            }
            else if(s.charAt(i) == '('){
                store.push('(');
            }
            maxDepth = Math.max(maxDepth, store.size());
        }
        
        return maxDepth;
    }
}
