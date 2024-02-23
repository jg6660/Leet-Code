class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize != 0) return false;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int val: hand){
            minHeap.add(val);
        }

        while(!minHeap.isEmpty()){
            int first = minHeap.poll();
            for(int i=1; i<groupSize; i++){
                if(!minHeap.remove(first+i)) return false;
            }
        }

        return true;
    }
}
