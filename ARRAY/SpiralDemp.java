import java.util.Scanner;

public class SpiralDemp {
    public static void Spral(int data[][]) {
        int rowstrat = 0, rowend = data.length - 1;
        int colstart = 0, colend = data[0].length - 1;
        while (rowstrat < rowend && colstart < colend) {
            // j=colum, i=row
            // top
            for (int j = colstart; j <= colend; j++) {
                System.out.print(data[rowstrat][j] + ",");
            }
            // right
            for (int i = rowstrat + 1; i <= rowend; i++) {
                System.out.print(data[i][colend] + ",");
            }
            // buttom
            for (int j = colend - 1; j >= colstart; j--) {
                if (rowstrat == rowend) {
                    break;
                }
                System.out.print(data[rowend][j] + ",");
            }
            // left
            for (int i = rowend - 1; i >= rowstrat + 1; i--) {
                if (colstart == colend) {
                    break;
                }
                System.out.print(data[i][colstart] +",");
            }
            rowstrat++;
            rowend--;
            colstart++;
            colend--;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        Spral(arr);

    }

}
