import java.util.Scanner;

public class powerDEmo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the base and power :");
        int base=in.nextInt();
        int sum=1;
        int power=in.nextInt();
        for(int i=1; i<=power; i++)
        {
             sum=sum*base;
        }
        System.out.println(sum);

    }
}
