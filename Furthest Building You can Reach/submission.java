class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        Queue<Integer> ladderAllocator = new PriorityQueue<>((a,b)->a-b);

        for(int i=0;i<heights.length-1; i++){
            int climb = heights[i+1] - heights[i];
            if(climb<=0) {
                continue;
            }

            ladderAllocator.add(climb);

            if(ladderAllocator.size()<=ladders){
                continue;
            }

            bricks -= ladderAllocator.poll();

            if(bricks<0){
                return i;
            }
        }

        return heights.length-1;
    }
}

//Time Complexity: O(NlogN) {logN to insert an element into heap}
//Space Complexity: O(N)
