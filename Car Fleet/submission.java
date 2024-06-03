class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] carMapping = new double[n][2];

        for(int i=0; i<n; i++){
            carMapping[i] = new double[]{position[i], speed[i]};
        }

        Arrays.sort(carMapping, (a,b) -> Double.compare(a[0],b[0]));

        Stack<Double> carFleet = new Stack<>();

        for(int i=n-1; i>=0; i--){
            double time = (target - carMapping[i][0])/carMapping[i][1];

            if(!carFleet.isEmpty() && time <= carFleet.peek()){
                continue;
            }

            carFleet.push(time);
        }

        return carFleet.size();
    }
}
