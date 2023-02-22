class Solution {
    public boolean isHappy(int n) {
        int sum =0;
        while(n!=1){

            while(n!=0){
                int k = n%10;
                sum += k*k;
                n=n/10;
            }

            n = sum;
            sum = 0;
            if(n>1 && n<10)
                return false;
        }
        return true;
    }   
}
