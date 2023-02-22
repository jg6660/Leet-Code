class Solution {
    public long sum(long n){
        long result =0;
        while(n>0){
            result+=n%10;
            n=n/10;
        }
        return result;
    }
    public long makeIntegerBeautiful(long n, int target) {

        long temp = n;
        if(sum(n)<=target) return 0;
        else{
            while(n++>0){
                if(sum(n)<=target)
                    break;
            }
        }
        return (n-temp);
    }
}
