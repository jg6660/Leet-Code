class Solution {
    public boolean isArmstrong(int n) {
        int result=0;
        String s = Integer.toString(n);
        int test = n;
        int length = s.length();
        while(test!=0)
        {
            int num = test%10;
            int num1 = 1;
            for(int i=0;i<length;i++)
            {
                num1*=num;
            }
            result+=num1;
            num1=1;
            test=test/10;
        }
        if(n == result)
            return true;
        else
            return false;
    }
}
