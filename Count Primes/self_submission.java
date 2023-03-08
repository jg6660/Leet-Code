class Solution {
    public int countPrimes(int n) {
       if(n<=2){
           return 0;
       }

       boolean[] result = new boolean[n];

       for(int i=2; i<= (int)Math.sqrt(n); i++){
           if(result[i] == false){
               for(int j= i*i; j<n; j+=i){
                    result[j] = true;
               }
           }
       }

       int countprimes = 0;
       for(int i=2; i<n;i++){
           if(result[i] == false){
               countprimes++;
           } 
       }

       return countprimes;
    }
}
