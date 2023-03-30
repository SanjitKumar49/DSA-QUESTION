public class Grid {
    public static void main(String[] args) {
        int n = 6, m = 6;
        System.out.println("toatl way of "+gridWay(0, 0, n, m));
    }

    private static int gridWay(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }
        int right = gridWay(i, j + 1, n, m);
        int down = gridWay(i + 1, j, n, m);
        return right + down;
    }
}
