import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=in.nextInt();
        int sum=0;

        for(int i=1; i<=num; i++)
        {
            
           
            sum=sum+i;

        }
        System.out.println("sum of natural no:" +sum);

    }
    
}
