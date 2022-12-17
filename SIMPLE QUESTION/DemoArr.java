import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class DemoArr {
    public static void main(String[] args) {
       

        Scanner in = new Scanner(System.in);
        int num[] = new int[10];
        int n =in.nextInt()
        for (int i = 0; i <n; i++) {
            num[i] = in.nextInt();
        }

        for (int i = 0; i <n; i++) {
            System.out.println(num[i]);
        }

    }
}
