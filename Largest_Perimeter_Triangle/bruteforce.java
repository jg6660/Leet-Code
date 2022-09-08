class Solution {
    public int largestPerimeter(int[] nums) {
        int Maxperimeter=0;
        int perimeter=0;
       for(int i=0;i<nums.length;i++)
           for(int j=i+1;j<nums.length;j++)
               for(int k=j+1;k<nums.length;k++)
               {
                   perimeter = test_triangle(nums[i],nums[j],nums[k]);
                   if(perimeter>Maxperimeter)
                       Maxperimeter = perimeter;
                   perimeter = 0;
               }
        return Maxperimeter;
    }
    public int test_triangle(int a,int b,int c)
    {
         if(a+b>c && b+c>a && a+c>b)
         {
            return a+b+c; 
         } 
            
        else
            return 0;
    }
}
