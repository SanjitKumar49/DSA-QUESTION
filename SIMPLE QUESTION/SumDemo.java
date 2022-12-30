import java.util.Scanner;

public class SumDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("entre the number: ");
        int num = in.nextInt();
        int rem, sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
