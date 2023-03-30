public class SellStock {
    // USING ARRAY CONCEPT
    // public static int stockProfit(int[] stock) {
    // int minimum = Integer.MAX_VALUE;
    // System.out.println(minimum);
    // int profit = 0;
    // for (int i = 0; i < stock.length; i++) {
    // if (minimum < stock[i]) {
    // int p = stock[i] - minimum;
    // profit = Math.max(profit, p);
    // } else {
    // minimum = stock[i];
    // }
    // }
    // return profit;
    // }

    // USING GREDDY CONCEPT
    static int maxProfit(int prices[], int n) {
        int buy = prices[0];
        int max_profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            } else if (prices[i] - buy > max_profit) {
                max_profit = prices[i] - buy;
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
         int stock[] = { 7, 1, 5, 3, 6, 4 };
        //int stock[] = { 7, 6, 4, 3, 1 };
        int n = stock.length;
        // int p = stockProfit(stock);
        System.out.println(maxProfit(stock, n));
    }

}
