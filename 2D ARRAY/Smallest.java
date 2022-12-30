public class Smallest {
    /*
     * public static void searchEliment(int data[][], int target) {
     * for (int i = 0; i < data.length; i++) {
     * for (int j = i + 1; j < data.length; j++) {
     * if (data[i][j] == target) {
     * System.out.print("index number is :" + "(" + i + "," + j + ")");
     * }
     * }
     * }
     * }
     */

    public static void minElement(int data[][]) {
       int smallnumber=data[0][0];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] <smallnumber) {
                    smallnumber = data[i][j];
                }
            }
        }
       
        System.out.println("shortest number in a arrays: " + smallnumber);
    }

    public static void main(String[] args) {
        int num[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, }, { 4, 3, 2, 6, 7, 9 } };

        // int target = 8;
        // searchELiment(num, target);
        minElement(num);

    }
}