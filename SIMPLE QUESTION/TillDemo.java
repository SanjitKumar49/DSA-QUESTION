import java.util.Scanner;

public class TillDemo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=1;
        int sum=0;

        while(num!=0)
        {
            num=in.nextInt();
            sum=sum+num;
 
        }
        System.out.println(sum);
    }
    
}
