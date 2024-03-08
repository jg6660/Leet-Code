class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap<>();

        for(int num: nums){
            counter.put(num, counter.getOrDefault(num,0)+1);
        }

        ArrayList<Integer> values = new ArrayList<>(counter.values());
        Comparator c = Collections.reverseOrder();
        Collections.sort(values,c);
        int max = 0;
        int count = 0;
        for(int value: values){
            if(max<value){
                max = value;
                count = 0 + value;
            }
            else if(max == value){
                count += value;
            }
        }

        return count;
    }
}
