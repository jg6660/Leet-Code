class Solution {
    public int strStr(String haystack, String needle) {
        int needle_length = needle.length();
        int haystack_length = haystack.length();
        int i=0, j=0;
        int count = 0;
        int result = 0;
        while(i<needle_length && j<haystack_length){
            if(count<needle_length && needle.charAt(i) == haystack.charAt(j)) {
                if(count ==0) result = j;
                i++;
                count++;
            }
            j++;
        }
        if(count == needle_length) return result;
        return -1;
    }
}
