public class Factorial {
    public static int fun(int n) {
        if (n == 1) {
           return n;
        }
       int fct=fun(n-1);
     int t= n*fct;
     return t;
      }

    public static void main(String[] args) {
       // System.out.println(fun(5));
      
       System.out.println(fun(10));
        /*
         * int sum=1;
         * for(int i=1; i<=n; i++){
         * sum*=i;
         * }
         * System.out.println(sum);
         */

    }
}
