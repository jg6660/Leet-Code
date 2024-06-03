class Solution {
  private HashMap<Character, Character> mapping;

  public Solution(){
    mapping = new HashMap<>();
    mapping.put(')', '(');
    mapping.put(']', '[');
    mapping.put('}', '{');
  }

  public boolean isValid(String s) {

    Stack<Character> stack = new Stack<>();

    for(int i=0; i<s.length(); i++){
        char c = s.charAt(i);

        if(mapping.containsKey(c)){
            char topElement = stack.isEmpty() ? '#': stack.pop();
            if(mapping.get(c) != topElement){
                return false;
            }
        }else{
                stack.push(c);
        }
    }

    return stack.isEmpty();
    
  }
}
