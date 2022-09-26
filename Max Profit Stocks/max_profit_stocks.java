// Brute Force Method

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i=0; i<prices.length;i++)
        {
            int sum = 0;
            for(int j=i+1;j<prices.length;j++)
            {
                sum = prices[j]-prices[i];
                if(maxProfit<sum)
                    maxProfit = sum;
            }
        }
        return maxProfit;
    }
}

// Optimized Method

class Solution {
    public int maxProfit(int[] prices) {
        int minprice = 99999;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<minprice)
                minprice = prices[i];
            else if(prices[i]-minprice>maxProfit)
                maxProfit = prices[i]-minprice;
        }
        return maxProfit;
}
}
