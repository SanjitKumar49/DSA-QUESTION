import java.util.Scanner;

public class Tringle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the height of trigle: ");
        int Hb=in.nextInt();

        System.out.println("enter the Base of trigle: ");
        int H=in.nextInt();
        int Area=(H*Hb)/2;
        System.out.println("Area of tringle: " +Area);

    }
}
