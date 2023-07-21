class Solution {
    public int[] sortArray(int[] nums) {
        
        if(nums.length<=1){
            return nums;
        }
        
        int pivot = nums.length/2;
        int[] leftSubArray = sortArray(Arrays.copyOfRange(nums,0, pivot));
        int[] rightSubArray = sortArray(Arrays.copyOfRange(nums,pivot,nums.length));
        
        return merge(leftSubArray, rightSubArray);
        
    }
    
    public int[] merge(int[] leftArray, int[] rightArray){
        int[] result = new int[leftArray.length + rightArray.length];
        
        int left = 0, right = 0;
        int iter = 0;
        while(left < leftArray.length && right < rightArray.length){
            if(leftArray[left] < rightArray[right] ){
                result[iter++] = leftArray[left++];
            }
            else{
                result[iter++] = rightArray[right++];
            }
        }
        
        while(left < leftArray.length){
            result[iter++] = leftArray[left++];
        }
        
        while(right < rightArray.length){
            result[iter++] = rightArray[right++];
        }
        
        return result;
    } 
}
