public class Stock {
    public static void StockSelling(int price[]) {
        int buyprize = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < price.length; i++) {
            if (buyprize < price[i]) {
                int profit = price[i] - buyprize;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprize = price[i];
            }
        }
        System.out.println(maxprofit);
    }
    public static void main(String[] args) {
        int num[] = { 7, 1, 5, 3, 6, 4 };
        StockSelling(num);
    }
}
