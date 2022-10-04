class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] visited = new int[26];
        
        for(int i=0;i<visited.length;i++)
            visited[i]=0;
        
        for(int i=0;i<sentence.length();i++)
        {
            visited[sentence.charAt(i)-'a']=1;
        }
        
        Arrays.sort(visited);
        
        if(visited[0]==0)
            return false;
        else
            return true;
    }
}


/* Leet code Set solution */

class Solution {
    public boolean checkIfPangram(String sentence) {
        // Empty set 'seen'.
        Set<Character> seen = new HashSet<>();
        
        // Iterate over 'sentence' add every letter to 'seen'.
        for (char currChar : sentence.toCharArray())
            seen.add(currChar);
        
        // If the size of 'seen' is 26, then 'sentence' is a pangram.
        return seen.size() == 26;
    }
}
