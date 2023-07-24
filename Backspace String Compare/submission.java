class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> store1 = new Stack<>();
        Stack<Character> store2 = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(store1.isEmpty() && s.charAt(i) == '#'){
                continue;
            }
            else if((store1.isEmpty() == false) && (s.charAt(i) == '#')){
                store1.pop();
            }
            else{
                store1.push(s.charAt(i));
            }
        }

        for(int j=0; j<t.length(); j++){
            if(store2.isEmpty() && t.charAt(j) == '#'){
                continue;
            }
            else if((store2.isEmpty() == false) && (t.charAt(j) == '#')){
                store2.pop();
            }
            else{
                store2.push(t.charAt(j));
            }
        }

        if(store1.equals(store2)){
            return true;
        }

        return false;
    }
}
