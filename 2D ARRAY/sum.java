public class sum {
    public static void main(String args[]) {
        int[][] arr = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int Sum = 0;

        for (int i = 1; i <arr.length-1; i++) {
            for (int j = 0; j < arr.length; j++) {

                Sum=Sum+arr[i][j];
            }
        }
        System.out.print(Sum);
    }
}