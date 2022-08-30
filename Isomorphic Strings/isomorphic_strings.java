class Solution {
    public boolean isIsomorphic(String s, String t) {
        int m = s.length();
        int n = t.length();
        
        if(m == n)
        {
            boolean[] marked = new boolean[256];
            Arrays.fill(marked, false);
            
            int[] map = new int[256];
            Arrays.fill(map,-1);
            for(int i=0;i< t.length();i++)
            {
                if(map[s.charAt(i)]==-1)
                {
                    if(marked[t.charAt(i)]==true)
                        return false;
                    marked[t.charAt(i)]=true;
                    map[s.charAt(i)]=t.charAt(i);
                }
                else if(map[s.charAt(i)]!=t.charAt(i))
                {
                    return false;
                }
            }
            return true;
        }
        else
            return false;
        
    }
}
