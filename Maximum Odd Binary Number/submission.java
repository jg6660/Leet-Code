class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones = 0;
        for(char ch: s.toCharArray()){
            if(ch == '1'){
                ones++;
            }
        }

        char[] result = new char[s.length()];
        Arrays.fill(result, '0');
        int i=0;
        if(ones !=0){
            result[s.length()-1] = '1';
            ones--;
            while(ones>0){
                result[i++]='1';
                ones--;
            }
        }

        return new String(result);
    }
}
