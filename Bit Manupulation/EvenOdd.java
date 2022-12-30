import java.util.Scanner;

public class EvenOdd {
    public static void Method() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the data: ");
        int num = in.nextInt();
        int bitmass = 1;
        // true means even number
        // false means odd number
        if ((num & bitmass) == 0) {
            System.out.println("even");

        } else {
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        Method();

    }
}
