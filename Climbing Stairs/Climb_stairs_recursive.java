public class Solution {
    private HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
    
    public int climbStairs(int n) {
       if(result.containsKey(n)){
           return result.get(n);
       }
        
       int store;
       if(n<3){
           store = n;
       }else{
           store = climbStairs(n-1) + climbStairs(n-2);
       }
       
       result.put(n,store);
        
       return store; 
    }
}
