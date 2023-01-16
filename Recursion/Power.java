public class Power {
    // time complexity is o(n)
    public static int fun(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int power = Power.fun(x, n - 1);
        int totalpower = power * x;
        return totalpower;
    }

    // tm o(log n)
    public static int fun2(int x, int n) { // x=2,n=3
        if (n == 0) {
            return 1;
        }
        int first = fun(x, n / 2) * fun(x, n / 2);
        if (n % 2 != 0) {
            first = first * x;
        }

        return first;
    }

    public static void main(String[] args) {
        System.out.println(fun2(2, 7));

    }
}
