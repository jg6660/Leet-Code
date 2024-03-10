class Solution {
    public String[] shortestSubstrings(String[] arr) {
        String[] result = new String[arr.length];
        for(int index=0; index<arr.length; index++){
            String temp = "";
            // Template for substring
            for(int i=0; i<arr[index].length();i++){
                inner:
                for(int j=i+1; j<=arr[index].length();j++){
                    String s = arr[index].substring(i,j);
                    
                    for(int l=0; l<arr.length; l++){
                        if(l==index) continue;
                        if(arr[l].contains(s)) continue inner;
                    }
                    
                    if(temp == "" || s.length()<temp.length() || (s.length() == temp.length() && s.compareTo(temp) < 0)){
                        temp = s;
                    }
                }
            }
            result[index] = temp;
        }
        
        return result;
    }
}
