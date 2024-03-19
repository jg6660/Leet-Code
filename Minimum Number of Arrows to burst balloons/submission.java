class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[1],b[1]));
        int count = 1;

        int[] point = points[0];
        long minPoint = point[1];
        for(int i=1; i<points.length; i++){
            if(minPoint < points[i][0]){
                minPoint = points[i][1];
                count++;
            }
        }

        return count;

    }
}
