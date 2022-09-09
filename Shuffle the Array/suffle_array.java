class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] final_arr = new int[nums.length];
        int i=0;
        int j=n;
        int k=0;
        int count=0;
        while(i<n||j<nums.length)
        {
            if(count%2==0)
            {
                final_arr[k]=nums[i];
                i++;
            }
            else
            {
                final_arr[k]=nums[j];
                j++;
            }
            k++;
            count++;
        }
        return final_arr;
    }
}
