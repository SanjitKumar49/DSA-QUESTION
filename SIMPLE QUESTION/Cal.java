import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter  two the number:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.print("what you you want: ");
        char choice = in.next().charAt(0);
        int sum;
        switch (choice) {
            case '+': {
                sum = num1 + num2;
                System.out.println(num1 + " and " + num2 + " sum of :" + sum);
                break;
            }
            case '-': {
                sum = num1 - num2;
                System.out.println(num1 + " and " + num2 + " Subtraction of :" + sum);
                break;
            }
            case '*': {
                sum = num1 * num2;
                System.out.println(num1 + " and " + num2 + " Multiplection of :" + sum);
                break;
            }
            case '/': {
                sum = num1 / num2;
                System.out.println(num1 + " and " + num2 + "  Divistion of :" + sum);
                break;
            }
            default:
                System.out.print("enter the valid opertion; ");
        }

    }

}
