import java.util.Scanner;

public class SearchArr {
    public static void LinearSearch(int n[], int p) {
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == p) {
                System.out.println("index is: " + i);
                count = count + 1;
            }
        }
        if (count == 0)
            System.out.println("no data found: ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the eliments: ");
        int num[] = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();

        }

        int target = 5;
        LinearSearch(num, target);
    }
}
