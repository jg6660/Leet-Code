class Solution {
    private HashMap<Integer, Integer> points = new HashMap<Integer, Integer>();
    private HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();

    private int maxPoints(int num){

        if(num == 0) return 0;

        if(num ==1) return points.getOrDefault(1,0);

        if(cache.containsKey(num)) return cache.get(num);

        int gain = points.getOrDefault(num,0);
        cache.put(num, Math.max(gain + maxPoints(num-2), maxPoints(num-1)));

        return cache.get(num);
    }

    public int deleteAndEarn(int[] nums) {
        int maxNumber = 0;

        for(int num: nums){
            points.put(num, points.getOrDefault(num,0) + num);
            maxNumber = Math.max(num, maxNumber);
        }

        return maxPoints(maxNumber);    
    }
}
