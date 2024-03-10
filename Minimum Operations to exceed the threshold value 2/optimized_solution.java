class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(long num : nums) if(num<k) pq.offer(num);
        
        int ans=0;
        while(pq.size()>1) {
            long a = pq.poll();
            long b = pq.poll();
            long val = 2*a + b;
            if(val<k) pq.offer(val);
            // System.out.println(pq);
            ans++;
        }
        if(pq.size()==1) ans++;
        return ans;
    }
}
