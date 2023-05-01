public class knapSack {

    // Momezation //
    public static int knapsack(int val[], int wt[], int w, int n, int dp[][]) {

        if (w == 0 || n == 0) {
            return 0;
        }
        if (dp[n][w] != -1) {
            return dp[n][w];
        }
        if (wt[n - 1] <= w) {
            int ans1 = val[n - 1] + knapsack(val, wt, w - wt[n - 1], n - 1, dp);
            int ans2 = knapsack(val, wt, w, n - 1, dp);
            dp[n][w] = Math.max(ans1, ans2);
            return dp[n][w];

        } else {
            dp[n][w] = knapsack(val, wt, w, n - 1, dp);
            return dp[n][w];
        }
    }

    public static int knapsackTab(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i - 1];
                int w = wt[i - 1];
                if (w <= j) {
                    int icprofit = v + dp[i - 1][j - w];
                    int excprofit = dp[i - 1][j];
                    dp[i][j] = Math.max(icprofit, excprofit);
                } else {
                    int excprofit = dp[i - 1][j];
                    dp[i][j] = excprofit;
                }
            }
        }
        print(dp);
        return dp[n][W];
        // print(dp);
    }

    public static void print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + "_|_");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int w = 7;
        int n = val.length;
        int dp[][] = new int[n + 1][w + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(knapsack(val, wt, w, n, dp));
        System.out.println(knapsackTab(val, wt, w));

    }
}
