class Solution {
    private int dist(int[] p){
        return p[0]*p[0] + p[1]*p[1];
    }

    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, (p1,p2)->{return dist(p1) - dist(p2);});

        int[][] result = new int[k][];

        for(int i=0; i<k; i++){
            result[i] = new int[]{points[i][0], points[i][1]};
        }

        return result;
    }
}
