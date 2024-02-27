class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       if(intervals.length == 0){
           return 0;
       }

       int noOfDistinct = 1; 
       Arrays.sort(intervals, (a,b)->Integer.compare(a[1],b[1]));

       int end = intervals[0][1];

       for(int i=1; i<intervals.length; i++){
           if(end<=intervals[i][0]){
               end = intervals[i][1];
               noOfDistinct++;
           }
       }

       return intervals.length-noOfDistinct;
    }
}
