class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = 0, right = 0;
        int result[] = new int[m+n];
        int iter = 0;
        while(left<m && right<n){
            if(nums1[left] < nums2[right]){
                result[iter++] = nums1[left++];
            }
            else{
                result[iter++] = nums2[right++];
            }
            System.out.println(Arrays.toString(result));
        }

        while(left<m){
            result[iter++] = nums1[left++];
        }
        while(right<n){
            result[iter++] = nums2[right++];
        }

        for(int i=0 ;i<result.length; i++){
            nums1[i] = result[i];
        }
    }
}
