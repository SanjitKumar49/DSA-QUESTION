import java.util.Arrays;
import java.util.Scanner;

public class DMatric {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int target = 8;
        Scanner in = new Scanner(System.in);
        System.out.print("enter the data: ");
        int i, j;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("index is: " + i + "." + j);
                }
            }
        }
        int maximum = Integer.MIN_VALUE;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > maximum) {
                    maximum = Math.min(arr[i][j], maximum);
                    System.out.println("maximum number: "+maximum);
                 }
            }
        }

    }
}