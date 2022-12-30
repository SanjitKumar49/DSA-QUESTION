import java.util.Scanner;

public class SetIth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the data: ");
        int num = in.nextInt();
        System.out.print("enter the index:");
        int i = in.nextInt();
        int bitmass = 1 << i;

        if ((num|bitmass) == 0) {
            System.out.println(0);
        } else {
           System.out.println(1);
        }
    }
}
