class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        
        for(int n: nums){
            minHeap.add((long)n);
        }
        
        while(minHeap.peek()<k){
            long num1 = minHeap.poll();
            long num2 = minHeap.poll();
            minHeap.add((long)(Math.min(num1, num2)*2 + Math.max(num1, num2)));
            count++;
        }

        return count;
    }
}

