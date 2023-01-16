public class Fibonnci {
    public static int fun(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int first = fun(n - 1);
        int second = fun(n - 2);
        int sum = first + second;
        return sum;
    }

    public static void main(String[] args) {
       
        System.out.println(fun(6));
    }
}
