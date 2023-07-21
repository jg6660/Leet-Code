class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length + 1];

        altitude[0] = 0;
        int maxAltitude = altitude[0];

        for(int i=1 ; i<altitude.length; i++){
            altitude[i] = altitude[i-1] + gain[i-1];
            maxAltitude = Math.max(maxAltitude, altitude[i]);
        }
        return maxAltitude;
    }
}
