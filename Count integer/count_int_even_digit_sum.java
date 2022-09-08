class Solution {
    public int countEven(int num) {
        int cnt=0;
        for(int i=1;i<=num;i++)
        {
            if(sum(i)) cnt++;
        }
        return cnt;
    }
    public boolean sum(int n)
    {
        int s=0;
        while(n!=0)
        {
            s+=n%10;
            n=n/10;
        }
        if(s%2==0) return true;
        else
            return false;
         
    }
}
