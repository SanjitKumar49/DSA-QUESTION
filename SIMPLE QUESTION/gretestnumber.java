import java.util.Scanner;

public class gretestnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("entre the three eliments: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if (num1 > num2) {
            if (num1 > num2) {
                System.out.println(num1 + " is a greter number:");
            } else {
                System.out.println(num2 + " is a greater number:");
            }
        } else {
            if (num2 > num3) {
                System.out.println(num2 + " is a greter number:");
            } else {
                System.out.println(num3 + " is a greater number:");
            }

        }

    }
}
