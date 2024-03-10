class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int j=0;
        long total = 0;
        for(int i=happiness.length-1; i>=0 && k>0; i--){
            if(happiness[i]-j>0){
                total += happiness[i]-j;
            }
            j++;
            k--;
        }
        
        return total;
    }
    

}
