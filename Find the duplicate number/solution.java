// Based on Binary Search utilized on counting the number of elements which are less than or equal to the current index

class Solution {
    public int findDuplicate(int[] nums) {
        int low = 1, high = nums.length-1;
        int duplicate = -1;

        while(low <= high){
            int mid = (low+high)/2;

            int count = 0;
            for(int num: nums){
                if(num <= mid){
                    count++;
                }
            }

            if(count > mid){
                duplicate = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return duplicate;
    }
}

//Flloyd Warshall Algorithm ( Hare and Tortoise)

class Solution {
    public int findDuplicate(int[] nums) {
        
        // Find the intersection point of the two runners.
        int tortoise = nums[0];
        int hare = nums[0];
        
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Find the "entrance" to the cycle.
        tortoise = nums[0];
        
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return hare;
    }
}
