class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        List<Integer> frequencies = new ArrayList<>(map.values());

        Collections.sort(frequencies);
        int elementRemoved = 0;

        for(int i=0; i<frequencies.size(); i++){
            elementRemoved += frequencies.get(i);
            if(elementRemoved > k){
                return frequencies.size()-i;
            }
        }

        return 0;
    }
}
