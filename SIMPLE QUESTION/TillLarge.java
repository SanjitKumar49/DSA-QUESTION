import java.util.Scanner;

public class TillLarge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, num1 = 0;
        num = in.nextInt();
        while (num != 0)
        {
            num = in.nextInt();
            if (num > num1) {
                num1 = num;
            }

        }
        System.out.println(num1);
    }

}
