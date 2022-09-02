class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int product = nums[len-1]*nums[len-2]*nums[len-3];
        int product1 = nums[0]*nums[1]*nums[len-1];
        if(product>product1)
            return product;
        else
            return product1;
        
    }
}
