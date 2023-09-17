public class StaircaseSearch {
    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 25, 37, 48 },
                { 32, 33, 39, 50 } };
        search(arr, 39);

    }

    private static void search(int[][] arr, int target) {
        int row = 0;
        int col = arr[0].length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                System.out.println("[" + row + "," + col + "]");
                return;
            } else if (target < arr[row][col]) {
                col--;
            } else {
                row++;
            }
        }
    }
}
