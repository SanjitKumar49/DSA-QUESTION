import java.util.Scanner;

class Practice {
    public static void add(int arr[][]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("please enter the data: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = obj.nextInt();
            }
        }
    }

    public static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void search(int arr[][], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == target) {
                    System.out.print("Index is :" + "[" + i + "," + j + "]");
                }
            }
        }

    }

    public static void spiral(int arr[][]) {
        int startRow = 0, startCol = 0;
        int endRow = arr.length - 1, endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startCol][i] + " ");

            }
            for (int j = startRow + 1; j <= endRow; j++) {
                System.out.print(arr[j][endCol] + ",");

            }
            for (int i = endCol - 1; i >= startCol; i--) {
                System.out.print(arr[endRow][i] + ",");

            }
            for (int j = endRow - 1; j >= startRow + 1; j--) {
                System.out.print(arr[j][startCol] + ",");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }
    public static void zero(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        int row[]=new int[m];
        int col[]=new int[n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==0){
                row[i]=1;
                col[j]=1;
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
            if(row[i]==1 || col[j]==1){
                arr[i][j]=0;
            }
            }
        }
      for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+",");
            }
            System.out.println();
      }  
    }
    
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 9 },
                        { 10, 0, 12, 13 },
                        { 14, 15, 16, 17 } };
                zero(arr);
       
    }
}