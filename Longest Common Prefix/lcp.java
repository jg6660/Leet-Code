











/* My solution */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = strs[0].length();
        String result = "";
        for(int i=0;i<strs.length;i++){
            if(min>strs[i].length())
                min = strs[i].length();
        }
        if(min<=0){
            return result;
        }
        if(strs.length==1)
            return strs[0];
        int count = 0;
        for(int i=0;i<min;i++){
            for(int j=0;j<strs.length-1;j++){

                if(strs[j].charAt(i) == strs[j+1].charAt(i)){
                 count++;
                 continue;   
                }
                else
                    break;
            }
            if(count == 2)
                result = result + strs[0].charAt(i);
            count = 0;
        }
        return result;
    }
}
