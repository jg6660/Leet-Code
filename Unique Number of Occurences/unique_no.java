class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> countOccurence = new HashMap<>();
        for(int i:arr)
        {
            if(countOccurence.containsKey(i))
                countOccurence.put(i,countOccurence.get(i)+1);
            else
                countOccurence.put(i,1);
        }
        Set<Integer> set = new HashSet<>();
        for(Map.Entry<Integer,Integer> entry:countOccurence.entrySet()){
            if(!set.contains(entry.getValue())){
                set.add(entry.getValue());
            }
            else
                return false;
        }
        return true;
        
    }
}
