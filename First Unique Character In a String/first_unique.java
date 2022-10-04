class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<s.length();i++) {
            if(map.containsKey(s.charAt(i))) {
               queue.remove(map.get(s.charAt(i)));
            } else {
                map.put(s.charAt(i),i);
                queue.add(i);
            }
        }
        if(queue.size()>0) {
            return (int) queue.peek();
        }
        return -1;
    }
}


/* Solution Leetcode */

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) 
                return i;
        }
        return -1;
    }
}
