class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap =
            new PriorityQueue<Integer>((n1, n2) -> n1 - n2);

        // keep k largest elements in the heap
        for (int n: nums) {
          heap.add(n);
          System.out.println(heap);
          if (heap.size() > k)
            heap.poll();
        }

        System.out.println(heap);
        // output
        return heap.poll();    
    }
}
