import java.util.Scanner;

public class SimpleClass {
    Scanner in = new Scanner(System.in);

    int num1, num2, sum;
    String str;

    public void Method() {
        System.out.print("enter the two number:");
        num1 = in.nextInt();
        num2 = in.nextInt();
        System.out.print("enter your name: ");
        str = in.next();
        System.out.println("Your name is :" + str);
        sum = num1 + num2;
        System.out.println("addition of two number: " + sum);
        sum = num1 - num2;
        System.out.println("Subtraction of two number: " + sum);
        sum = num1 * num2;
        System.out.println("multiplection of two number: " + sum);

    }

    public static void main(String args[]) {
        SimpleClass obj = new SimpleClass(); //here my SimpleClass is Constracutor
        obj.Method();

    }
}