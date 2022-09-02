class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, Comparator.comparingInt(row -> row[1]));
        int totalsize = 0;
        for(int i=boxTypes.length-1;i>=0;i--)
        {
            if(boxTypes[i][0]<=truckSize)
            {
                totalsize = totalsize + boxTypes[i][0]*boxTypes[i][1];
                truckSize = truckSize - boxTypes[i][0];
            }
            else
            {
                totalsize = totalsize + truckSize*boxTypes[i][1];
                truckSize = truckSize - boxTypes[i][0];
                break;
            }
        }
        return totalsize;
    }
}
