import java.util.Scanner;

public class usd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your amound: ");
         int IndinCurrence=sc.nextInt();
         double Usd=0.012*IndinCurrence;
       System.out.println("your USD: " +Usd);
    }
}
