class Solution {
    public String generateTheString(int n) {
        String result = "";
        
        if(n%2==1){
            for(int i=0;i<n;i++)
                result = result+'a';
        }
        else{
            for(int i=0;i<n-1;i++)
                result = result +'a';
            result = result + 'b';
        }
        return result;
    }
}
