class Solution2 {
    public int maxProfit(int[] prices) 
    {
        int profit=0;
        int min_price= Integer.MAX_VALUE;
        for(int i=1;i<prices.length;i++)
        {   
            int j=i-1;
            if(prices[i]>prices[j])
                profit+=prices[i]-prices[j];
        }
     return profit;
}
}
