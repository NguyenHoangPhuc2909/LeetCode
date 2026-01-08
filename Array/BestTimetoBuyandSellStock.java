package Array;

public class BestTimetoBuyandSellStock {
    // O(n^2)
    // public int maxProfit(int[] prices) {
    //     int best = 0;
    //     for(int i = 0; i < prices.length - 1; i++){
    //         for(int j = i + 1; j < prices.length; j++){
    //             int profit = prices[j] - prices[i];
    //             if(profit > best) best = profit;
    //         }
    //     }
    //     return best;
    // }
    
    // O(n)
    public int maxProfit(int[] prices){
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++){
            int profit = prices[i] - minPrice;

            if(prices[i] < minPrice) minPrice = prices[i];
            if(profit > maxProfit) maxProfit = profit;
        }
        return maxProfit;
    }


    public static void main(String[] args){
        BestTimetoBuyandSellStock best = new BestTimetoBuyandSellStock();

        int[] prices = {7, 1, 5, 3, 6, 4};
        int profit = best.maxProfit(prices);

        if(profit > 0) {
            System.out.println(profit);
        }
        else {
            System.out.println(0);
        }
    }
}