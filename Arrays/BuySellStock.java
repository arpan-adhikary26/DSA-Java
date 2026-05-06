// Program: Best Time to Buy and Sell Stock

// Problem:
// Given an array where prices[i] is the stock price on day i,
// find the maximum profit by buying on one day and selling on another day.

// Condition:
// - You must buy before you sell
// - Only one transaction allowed

// Example:
// Input  : [7, 1, 5, 3, 6, 4]
// Output : 5  (Buy at 1, Sell at 6)

package Arrays;

public class BuySellStock{

    public static int buySellStock(int prices[]){
        int n = prices.length;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        // Calculating buy price
        for(int i=0; i<n; i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }

            // Calculating profit if selling today
            else{
                int profit = prices[i]-minPrice;
                maxProfit = Math.max(maxProfit,profit);
            }
        }
        return maxProfit;     
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Maximum Profit: " + buySellStock(prices));
    }
}