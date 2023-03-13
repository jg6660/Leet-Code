class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = 99999;
        int maxProfit = 0;
        int Profits[] = new int[prices.length];
        for(int i=0; i<prices.length; i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }
            if(maxProfit<prices[i] - minPrice){
                maxProfit = prices[i] - minPrice;
                Profits[i] = maxProfit;
                maxProfit = 0;
                minPrice = 9999;
            }
        }
        System.out.println(Arrays.toString(Profits));
        int totalProfit = 0;
        for(int i=0;i<Profits.length; i++){
            totalProfit += Profits[i];
        }
        return totalProfit;
    }
}
