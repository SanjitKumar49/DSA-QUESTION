// find the odd and even number: 
// odd number:1,3,5,7,9,1.....
//even number=0,2,4,6,8,10..... even%2==0;   eg:10%2==0 
import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.print("yes it is even no: " + num);

        } else {
            System.out.println(num + " number is odd number.");
        }

    }
}
