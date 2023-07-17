class Solution {
    public int lengthOfLastWord(String s) {
        String result = s.trim();
        int length = 0;
        int s_length = result.length();
        char[] result_char = result.toCharArray();
        for(int i= s_length-1; i>=0 ; i--){
            if(result_char[i] == ' '){ break;}
            else { length++;}
        }

        return length;
    }
}
