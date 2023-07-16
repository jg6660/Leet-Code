class Solution {
    private HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        
        if(!memo.containsKey(n)){
            memo.put(n, tribonacci(n-3)+tribonacci(n-2)+tribonacci(n-1));
        }
        
        return memo.get(n);
    }
}
