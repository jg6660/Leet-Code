// Using Heaps

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == k){
            return nums;
        }

        HashMap<Integer, Integer> interim = new HashMap<Integer, Integer>();

        for(int num: nums){
           interim.put(num , interim.getOrDefault(num, 0) +1);     
        }

        Queue<Integer> heap = new PriorityQueue(
            (n1, n2) -> interim.get(n1) - interim.get(n2));

        for(int n: interim.keySet()){
            heap.add(n);
            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] result = new int[k];

        for(int i=k-1; i>=0; i--){
            result[i] = heap.poll();
        }

        return result;
    }
}
