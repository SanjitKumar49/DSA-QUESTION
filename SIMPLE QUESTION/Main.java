import java.util.*;

class Main {
    static int notavl = 0;

    public static void SearchElement(int Eliment[],int search) {
        for (int i = 0; i < Eliment.length; i++) {
            if (Eliment[i] == search) {
                System.out.print("Index is: " + i);
                notavl = notavl + i;
            }
        }
        if (notavl == 0) {
            System.out.print("number is not found: ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num[] = new int[20];
        System.out.print("enter the eliments: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }

        System.out.print("enter the search eliment: ");
        int t = in.nextInt();
        SearchElement(num, t);

    }

}