
import java.util.Scanner;


public class BinarySearch {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        int fi = 0;
        int li = array.length - 1;
        int mid = (li + fi) /2;
        Scanner in = new Scanner(System.in);
        System.out.print("enter search number: ");
        int search = in.nextInt();

        while (fi <= li) {
            if (array[mid] == search) {
                System.out.println("elemenet: " + search + " in index no: " + mid);
                break;
            } else if (array[mid]<search) {
                fi = mid + 1;
            } else {
                li = mid - 1;
            }
            mid = (li + fi) / 2;
            System.out.println(mid);
        }

    }
}
