class Solution {
    public int maxProduct(int[] nums) {

    int n = nums.length,ans = Integer.MIN_VALUE;
    int product = 1;
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
           product *= nums[j];
           ans = Math.max(ans, product); 
        }
        product = 1;
    }
    
    return ans;
    }
}
