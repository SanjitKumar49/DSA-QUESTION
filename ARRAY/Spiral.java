import java.util.Arrays;
import java.util.Scanner;

public class Spiral {

    public static void Search(int arr[][], int search) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Eliment: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == search) {
                    System.out.print("[" + i + "," + j + "]");
                }

            }
        }

    }

    public static void main(String[] args) {
        Scanner newio = new Scanner(System.in);
        System.out.println("Searching Eliments: ");
        int arr[][] = new int[3][3];
        int target = newio.nextInt();

        Search(arr, target);

    }

}
