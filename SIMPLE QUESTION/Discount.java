import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = in.nextInt();
        if (num >= 1000 && num <= 5000) {
            System.out.println("20% Dicount: ");
            float sum = (num * 20) / 100;
            Float amount = (num - sum);
            System.out.println(amount);
        } else if (5000 <= num && num > 1000) {
            System.out.println("50% Dicount: ");
            float sum = (num * 50) / 100;
            Float amount = (num - sum);
            System.out.println(amount);

        } else {
            System.out.println("5% Dicount: ");
            float sum = (num * 5) / 100;
            Float amount = (num - sum);
            System.out.println(amount);
        }
    }
}
