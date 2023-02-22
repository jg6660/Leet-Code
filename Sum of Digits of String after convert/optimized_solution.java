class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        for(char letter: s.toCharArray()){
            int x = letter-'a'+1;
            sum += (x % 10) + (x/10);
        }
        for(int i = 1; i < k; i++){
            int x = sum;
            sum = 0;
            while(x > 0){
                sum += (x % 10);
                x /= 10;
            }
        }
        
        return sum;
    }
}
