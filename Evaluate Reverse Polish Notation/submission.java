class Solution {
    public int evalRPN(String[] tokens) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<tokens.length;i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")){
                stack.push((Integer.parseInt(tokens[i])));
            }else if(tokens[i].equals("+")){
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                result = operand1 + operand2;
                stack.push(result);
            }else if(tokens[i].equals("-")){
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                result = operand2 - operand1;
                stack.push(result);
            }else if(tokens[i].equals("*")){
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                result = operand1 * operand2;
                stack.push(result);
            }else if(tokens[i].equals("/")){
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                result = operand2/operand1;
                stack.push(result);
            }
        }

        result = stack.pop();
        return result;
    }
}
