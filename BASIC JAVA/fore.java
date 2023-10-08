import java.util.Scanner;

public class fore {
    public static void main(String[] args) {
        int a;
        System.out.println("enter the no:");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        for(int i=1; i<=10; i++)
        {
            System.out.println("table of:" +a*i);
            
        }
    }
}
