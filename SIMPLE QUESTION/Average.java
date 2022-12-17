import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = in.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        double avr = sum / num;
        System.out.println(avr);

    }

}
