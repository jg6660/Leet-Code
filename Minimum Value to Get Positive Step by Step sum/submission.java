class Solution {
    public int minStartValue(int[] nums) {
        int startValue = 1;

        while(true){
            int total = startValue;
            boolean check = true;

            for(int num: nums){
                total += num;
                if(total<1){
                    check = false;
                    break;
                }
            }

            if(check){
                break;
            }
            else{
                startValue +=1;
            }
        }

        return startValue;
    }
}
