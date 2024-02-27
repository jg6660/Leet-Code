class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));

        List<int[]> res = new ArrayList<>();

        for(int[] interval: intervals){
            if(res.isEmpty() || res.get(res.size()-1)[1]<=interval[0]){
                res.add(interval);
            }
            else{
                return false;
            }
        }

        return true;
    }
}
