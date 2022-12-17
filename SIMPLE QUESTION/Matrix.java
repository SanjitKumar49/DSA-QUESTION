import java.util.Arrays;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {

        int arr[][]=new int[3][3];

        System.out.println("no of rows is:"+arr.length);
        Scanner in=new Scanner(System.in);
        System.out.print("enter the matrix eliments number: ");

        for(int row=0; row<arr.length;row++)
        {
            for(int column=0; column<arr[row].length; column++)
            {
                arr[row][column]=in.nextInt();
            }
        }

        // for(int row=0; row<arr.length;row++)
        // {
        //     for(int column=0; column<arr[row].length; column++)
        //     {
        //         System.out.print(arr[row][column]+" ");
        //     }
        //     System.out.println("");
        // }
        for(int row=0; row<arr.length;row++)
        System.out.println(Arrays.toString(arr[row]));
    }
    
}
