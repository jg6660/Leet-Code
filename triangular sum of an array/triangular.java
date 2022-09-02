class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length==1)
            return nums[0];
        else
        {
            int[] temp = nums.clone();
            while(temp.length!=1)
            {
                int len = temp.length; 
                int[] temp_array = new int[len-1];
                for(int i=0;i<temp_array.length;i++)
                    temp_array[i] = (temp[i]+temp[i+1])%10;
                temp = temp_array.clone();
            }
            return temp[0];
        }
    }
}
