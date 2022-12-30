import java.util.Arrays;

public class NonRepating {
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 5, 8, 7, 3, 1, 2 };
        Arrays.sort(num);
        for (int i = 1; i < num.length-1; i++) {

            if (num[i] == num[i -1]) {
                System.out.print(num[i] + " ");
            }

        }
    }
}
