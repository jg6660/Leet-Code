class Solution {
    public boolean isSubsequence(String s, String t) {
      if(s.equals("")) return true;
      if(t.equals("")) return false;
      int s_length = s.length();
      int t_length = t.length();
      int count = 0;  
      for(int i=0;i<t_length;i++){
          if(s.charAt(count) == t.charAt(i)){
              count++;
              if(count == s.length()) return true;
          } 
      }
      return false;

    }
}
