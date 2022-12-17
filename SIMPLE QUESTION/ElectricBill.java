import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int unit=8;
        int bill=unit*num;
        System.out.println("Electricity bill is: "+bill+"$") ;
        
    }
    
}
