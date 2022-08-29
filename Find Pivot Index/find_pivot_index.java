class Solution {
    public int pivotIndex(int[] nums) {
        int result;
        int left_sum = 0;
        int right_sum = 0;
        if(nums == null || nums.length == 0)
        {
            return -1;
        }
        for (int i=0;i<nums.length; i++)
        {
            if(i==0)
            {
                left_sum = 0;
                for (int m=i+1; m<nums.length;m++)
                {
                    right_sum+=nums[m];
                }
                if(left_sum == right_sum)
                    return 0;
            }
            for(int k=0;k<=i-1;k++)
                left_sum+=nums[k];
            
            for(int m=i+1;m<nums.length;m++)
                right_sum+=nums[m];
            if(left_sum == right_sum)
                return i;
            left_sum = 0;
            right_sum = 0;
        }
        return -1;
        
    }
}
