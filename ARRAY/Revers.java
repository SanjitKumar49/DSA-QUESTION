import java.util.Arrays;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class Revers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int data[] = new int[8];
        int start = data[0], end = data.length - 1;
        System.out.println("data length is: " + data.length);

        for (int i = 0; i < data.length; i++) {
            data[i] = in.nextInt();
        }

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        while (start < end) {
            int temp = data[end];
            data[end] = data[start];
            data[start] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

    }

}
