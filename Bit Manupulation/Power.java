import java.lang.reflect.Method;

public class Power {
    public static void main(String[] args) {
        isPowerofTwo(8);

    }

     public static boolean isPowerofTwo(long n) {

        return (n & (n - 1)) == 0;

    }


    public static void Method(int n)
    {
        for(int i=0; i<n.length; i++)
        {
            if(n[i]==1)
            {
    System.out.println(i);
            }
        }
    }

}