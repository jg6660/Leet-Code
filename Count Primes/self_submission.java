class Solution {
    public boolean prime(int n){
        if (n <= 1)
            return false;
 
        // Check if number is 2
        else if (n == 2)
            return true;
 
        // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;
 
        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;

    }
    public int countPrimes(int n) {
        int count =0;
        for(int i = 0;i<n;i++)
        {
            if(prime(i)){
                count++;
            }
        }
        return count;
    }
}
