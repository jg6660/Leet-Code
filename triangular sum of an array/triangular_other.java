class Solution {
    int result= 0; 
    
    public int triangularSum(int[] nums) {
        calcSum(nums);
        
        return result;
    }
    
    public void calcSum(int[] nums){
        if(nums.length == 1){
            result= nums[0];
            return;
        }
        
        int n= nums.length;
        int[] newNums= new int[n-1];
        
        for(int i=0; i<n-1; i++){
            newNums[i]= ( nums[i] +nums[i+1] )%10;
        }
        
        calcSum(newNums);
    }
}
