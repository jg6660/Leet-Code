class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int Maxcount = count;
        int num = nums[0];
        int Maxnum = num;
        for(int i=1; i<nums.length;i++)
        {
            if(nums[i]==num)
            {
                System.out.println("Hi");
                count++;
                num = nums[i];
                if(i==nums.length-1 && Maxcount<=count)
                {
                    Maxcount = count;
                    Maxnum = num;
                }
            }
            else
            {
                if(count>Maxcount)
                {
                    System.out.println("hello");
                    Maxcount = count;
                    Maxnum = num;
                    count =1;
                    num = nums[i];
                }
                else
                {
                    System.out.println("Bye");
                    count =1;
                    num = nums[i];
                }
            }
        }
        return Maxnum;
        
    }
}





class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
