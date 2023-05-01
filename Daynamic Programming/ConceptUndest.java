import java.util.Arrays;

public class ConceptUndest {

              // Memozation //
    public static int pif(int n, int dp[]) {
        if (n == 0) 
            return 1;
        if (n<0) 
            return 0;
        
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = pif(n - 1, dp) + pif(n - 2, dp);
        return dp[n];
    }

    // Tabulation //
    public static int countUseTabul(int n,int dp[]) {
       // int dp[] = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1] + 0;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(pif(n, dp));
        System.out.println(countUseTabul(n,dp));
    }
}