class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        while(n!=1)
        {
            System.out.println("Hello");
            while(n!=0)
            {
                int num = n%10;
                sum = sum + num*num;
                System.out.println(sum);
                n = n/10;
            }
            n = sum;
            sum = 0;
            System.out.println(n);
        }
        return true;
}
}
