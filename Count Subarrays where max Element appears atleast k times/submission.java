class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxElement = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            maxElement = Math.max(maxElement, nums[i]);
        }
        
        long count =0;
        int maxElementCount = 0;
        int j=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == maxElement){
                maxElementCount++;
            }

            while(maxElementCount == k){
                if(nums[j] == maxElement){
                    maxElementCount--;
                }
                j++;
            }

            count += j;
        }

        return count;
    }
}



//Brute Force
        // int maxElement = Integer.MIN_VALUE;

        // for(int i=0; i<nums.length; i++){
        //     maxElement = Math.max(maxElement, nums[i]);
        // }
        
        // int count =0;

        // for(int i=0; i<nums.length; i++){
        //     int maxElementCount = 0;
        //     for(int j=i; j<nums.length; j++){
        //         if(nums[j] == maxElement){
        //             maxElementCount++;
        //         }
        //         if(maxElementCount >= k){
        //             count++;
        //         }
        //     }
        // }

        // return count;
