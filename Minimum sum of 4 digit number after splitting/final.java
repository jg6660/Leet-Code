class Solution {
    public int minimumSum(int num) {
        int[] num_arr = new int[4];
        int i=0;
        int num1, num2;
        while(num!=0)
        {
            num_arr[i++] = num%10;
            num = num/10;
        }
        Arrays.sort(num_arr);
        if(num_arr[0]==0 || num_arr[2] ==0)
            num1 = num_arr[2];
        else
            num1 = num_arr[0]*10+num_arr[2];
        
        if(num_arr[1]==0 || num_arr[3] ==0)
            num2 = num_arr[3];
        else
            num2 = num_arr[1]*10+num_arr[3];
        
        int sum = num1 + num2;
        return sum;
    }
}
