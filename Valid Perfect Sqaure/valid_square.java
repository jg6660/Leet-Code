class Solution {
    public boolean isPerfectSquare(int num) {
        long longnum = num;
        for(long i=1;i*i<=longnum;i++)
        {
            if(i*i==num)
                return true;
        }
        return false;
    }
}
