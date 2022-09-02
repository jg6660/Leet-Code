class Solution {
    public boolean validPalindrome(String s) {
        int count = 0;
        int i = 0;
        int j = s.length()-1;
        while(i<s.length()/2)
        {
            if(Character.compare(s.charAt(i),s.charAt(j))==0)
            {
                i++;
                j--;
            }
            else
            {
                if(Character.compare(s.charAt(i+1),s.charAt(j))==0)
                {
                    i++;
                    count++;
                }
                else if(Character.compare(s.charAt(i),s.charAt(j-1))==0)
                {
                    count++;
                    j--;
                }
                else
                {
                    System.out.println("Hi");
                    return false;
                }
            }
        }
        return true;
        
    }
}
