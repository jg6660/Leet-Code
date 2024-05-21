class Solution {
    public String longestPalindrome(String s) {
        int reslen = 0;
        String res = "";
        int l,r;
        for(int i=0;i<s.length(); i++){
            //odd length
            l=i; r=i;
            while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
                if(r-l+1 > reslen){
                    reslen = r-l+1;
                    res = s.substring(l,r+1);
                }
                l--;
                r++;
            }

            //even length;
            l=i; r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
                 if(r-l+1 > reslen){
                    reslen = r-l+1;
                    res = s.substring(l,r+1);
                }
                l--;
                r++;
            }
        } 

        return res;  
    }
}
