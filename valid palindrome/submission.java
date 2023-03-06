class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals("")) return true;
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int j = s.length();
        for(int i=0; i<j/2; i++){
            if(s.charAt(i) != s.charAt(j-i-1)) return false;
        }
        return true;
    }
}
