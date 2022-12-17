import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the starting point: ");
        float num = in.nextFloat();
        System.out.print("enter the ending point: ");
        float num2 = in.nextFloat();
        float distance=num2-num;
        System.out.println("distance is: "+distance +"km");
    }
}
