class Solution {
    private int dist(int[] p){
        return p[0]*p[0] + p[1]*p[1];
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((i1,i2) -> {
             return dist(points[i2]) - dist(points[i1]);   
        });

        for(int i=0; i<points.length; i++){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }

        int[][] result = new int[k][];

        for(int i=0; i<k; i++){
            int idx = pq.poll();
            result[i] = points[idx];
        }

        return result;
    }
}
