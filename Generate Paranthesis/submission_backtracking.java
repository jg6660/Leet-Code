class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtracking(result , new StringBuilder(), 0, 0,n);
        return result;
    }

    public void backtracking(List<String> result, StringBuilder currString, int leftCount, int rightCount, int n){
        if(currString.length() == 2*n){
            result.add(currString.toString());
            return;
        }
        if(leftCount<n){
            currString.append("(");
            backtracking(result, currString, leftCount+1, rightCount, n);
            currString.deleteCharAt(currString.length()-1);
        }
        if(leftCount > rightCount){
            currString.append(")");
            backtracking(result, currString, leftCount, rightCount+1, n);
            currString.deleteCharAt(currString.length()-1);
        }
    }
}
