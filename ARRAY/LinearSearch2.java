import java.util.Scanner;

public class LinearSearch2 {
    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner obj = new Scanner(System.in);
        System.out.println("please enter the Array ELement: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }
        System.out.println(linearSearch(arr, 5));
        printArray(arr);
    }
}
