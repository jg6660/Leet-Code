class Solution {

    public int countBinary(int n){
        int mask = 1;
        int count = 0;
        for(int i=0; i<32; i++){
            if((n&mask) != 0){
                count++;
            }

            mask <<=1;
        }

        return count;
    }

    public int[] countBits(int n) {
        int[] result = new int[n+1];

        for(int i=0; i<=n; i++){
            result[i] = countBinary(i);
        }

        return result;
    }
}
