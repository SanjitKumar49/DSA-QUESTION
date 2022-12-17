import java.util.Scanner;

public class CI {
    public static void main(String[] args) {
        float sum=1;
        Scanner in = new Scanner(System.in);
        System.out.print("enter the rate: ");
        float r = in.nextFloat();
        System.out.print("enter the principle amount: ");

        float p = in.nextFloat();
         sum=sum*(1+r/100);

    }

}
