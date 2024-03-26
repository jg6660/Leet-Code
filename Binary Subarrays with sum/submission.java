class Solution {

    private int slidingWindowAtMost(int[] nums, int goal) {
        int start = 0, currentSum = 0, totalCount = 0;

        // Iterate through the array using a sliding window approach
        for (int end = 0; end < nums.length; end++) {
            currentSum += nums[end];

            // Adjust the window by moving the start pointer to the right
            // until the sum becomes less than or equal to the goal
            while (start <= end && currentSum > goal) {
                currentSum -= nums[start++];
            }

            // Update the total count by adding the length of the current subarray
            totalCount += end - start + 1;
        }
        return totalCount;
    }


    public int numSubarraysWithSum(int[] nums, int goal) {
     return slidingWindowAtMost(nums, goal) - slidingWindowAtMost(nums, goal - 1);
    }
}


// Using Brute Force
// int count = 0;
// int sum = 0;
// for(int i=0; i<nums.length; i++){
//     for(int j=i; j<nums.length; j++){
//         sum += nums[j];
//         if(sum == goal) count++;
//         if(sum > goal) break;
//     }
//     sum=0;
// }

// return count;



// Using Prefix Sum
// int currentSum = 0;
// int totalCount = 0;
// HashMap<Integer, Integer> frequency = new HashMap<Integer, Integer>();

// for(int num: nums){
// currentSum += num;
// if(currentSum == goal){
//     totalCount += 1;
// }

// if(frequency.containsKey(currentSum-goal)){
//     totalCount += frequency.get(currentSum - goal);
// }

// frequency.put(currentSum, frequency.getOrDefault(currentSum,0)+1);
// }

// return totalCount;
