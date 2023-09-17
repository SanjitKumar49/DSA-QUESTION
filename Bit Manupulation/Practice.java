import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        // System.out.println(powerTwo(7));
        countBit(5);
    }

    public static boolean powerTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    private static int[] countBit(int n) {
        int result[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            result[i] = result[(i & (i - 1))] + 1;
        }
        // System.out.println(Arrays.toString(result));
        print(result);
        return result;
    }

    private static void print(int[] result) {
    for(int i=0; i<result.length; i++){
        System.out.print("["+result[i]+"]"+",");
    }
    System.out.println();
    }
}
