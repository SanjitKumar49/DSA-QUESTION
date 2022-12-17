import java.util.*;
public class Factor {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("enter the num no: ");
        int num1=in.nextInt();
        for(int i=1; i<=num1; i++)
          if(num1%i==0){
            System.out.print(i +" ");
          }
    }
}
