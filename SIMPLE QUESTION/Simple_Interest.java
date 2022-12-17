import java.util.Scanner;

public class Simple_Interest {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("enter principle amount: ");
        int P=in.nextInt();
        System.out.print("enter Rate of Interst : ");
        int R=in.nextInt();
        System.out.print("enter the Time taken: ");
        int T=in.nextInt();

        double SI=(P*R*T)/100;
        System.out.print("Your simple intrest is: "+SI);
        


    }
}
