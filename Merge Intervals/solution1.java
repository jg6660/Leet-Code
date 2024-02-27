class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        for(int i=1; i<intervals.length; i++){
            int currLast = intervals[i][0];
            if(currLast<=res.get(res.size()-1)[1]){
                res.get(res.size()-1)[1] = Math.max(res.get(res.size()-1)[1], intervals[i][1]);
            }
            else{
                res.add(intervals[i]);
            }
        }

        return res.toArray(new int[res.size()][]);
    }
}
