class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0;
        for(int i=0 ; i<height.length; i++){
            for(int j=i+1; j<height.length; j++){
                int width = j-i;
                maxarea = Math.max(maxarea,(Math.min(height[i],height[j])*width));
            }
        }

        return maxarea;
    }
}

// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Number of test cases passed : 56/61
