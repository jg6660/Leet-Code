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
