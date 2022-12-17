import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumArr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the eliments: ");
        int num[]=new int[10];
        int n=num.length;
        for(int i=0; i<n; i++)
        {
            num[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(num));
        int sum=0; 
       for(int i=0; i<n; i++)
       {
        sum+=num[i];

       }
       System.out.println("Total Sum of Array: "+sum);
       double avrg= (sum/n);
       System.out.println("Average number is: "+avrg);
        

        
    }
    
}
