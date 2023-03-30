public class Spiral {

    public static void spiralOrder(int[][] matrix) {
        int startrow = 0, startcol = 0, endrow = matrix.length - 1, endcol = matrix[0].length - 1;
        while (startrow <= endrow && startcol <= endcol) {
            // top
            for (int i = startcol; i <= endcol; i++) {
                System.out.print(matrix[startrow][i] + ",");
            }
            for (int i = startrow+1; i <= endcol; i++) {
                System.out.print(matrix[i][endcol] + ",");
            }
            for (int i = endcol - 1; i >= startcol; i--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(matrix[endrow][i] + ",");
            }
            for (int i = endrow - 1; i >= startrow+1; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(matrix[i][startcol] + ",");
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 },
                { 4, 3, 9 },
                { 5, 4, 3 }
        };
        spiralOrder(arr);
    }
}
