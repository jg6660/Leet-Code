class Solution {
    public int minOperations(int n) {
        int count = 0;

        while(n>0){
            System.out.println(n);
            count++;

            double power = Math.log(n)/Math.log(2);

            int prePower = (int) Math.pow(2, (int)power);
            int nextPower = (int) Math.pow(2, (int)power+1);

            int diff = n-prePower;
            int diff2 = nextPower-n;

            if(diff>diff2) {n=diff2;}
            else {n=diff;}
        }

        return count;
    }
}
