public class Decr {
    public static void decMethod(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n);
        decMethod(n - 1);
    }

    public static void main(String[] args) {
        decMethod(5);

    }

}