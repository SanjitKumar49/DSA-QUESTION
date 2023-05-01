import java.util.*;

public class Calimbing {
    public static int countway(int n, int way[]) {
        way[0] = 1;
        if (n < 0) {
            return 0;
        }
        if (way[n] != -1) {
            return way[n];
        }
        way[n] = countway(n - 1, way) + countway(n - 2, way) + countway(n - 3, way);
        return way[n];
    }

    public static int secondMethod(int n, int way[]) {
        way[0] = 1;
        way[1] = 1;

        for (int i = 2; i <= n; i++) {

            if (i == 2) {
                way[i] = way[i - 1] + way[i - 2] + 0;
            } else {
                way[i] = way[i - 1] + way[i - 2] + way[i - 3];
            }
        }
        return way[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int way[] = new int[n + 1];
        Arrays.fill(way, -1);
        System.out.println(countway(n, way));
        System.out.println(secondMethod(n, way));

    }
}
