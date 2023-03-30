import java.lang.reflect.Method;

public class Power {

    public static void myPow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int p = myPow(x, n - 1);
        System.out.print(p*x);
        //return p * x;
    }

    public static void main(String[] args) {
        myPow(2, 2);

    }
    // public static boolean isPowerofTwo(long n) {

    // return (n & (n - 1)) == 0;
    // }
    // public static void Method(int n)
    // {
    // for(int i=0; i<n.length; i++)
    // {
    // if(n[i]==1)
    // {
    // System.out.println(i);
    // }
    // }
    // }

}