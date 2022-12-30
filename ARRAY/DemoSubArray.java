import java.util.Arrays;
import java.util.Scanner;

public class DemoSubArray {
    public static void subArray(int num[])
    {
        int currentsum=0;
        int maximumsum=Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            int start=num[i];
            for(int j=1; j<num.length; j++)
            {
                int end=num[j];
                for(int k=start; k<end; k++)
                {
                  //  currentsum+=num[k];
                  System.out.print(num[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        // System.out.println("currentsum is: "+currentsum);
        // if(maximumsum<currentsum)
        // {
        //     maximumsum=currentsum;
        // }
        // System.out.println("maximum sum is: "+maximumsum);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number: ");
        
     int num[]=new int[10];
     for(int i=0; i<num.length; i++)
     {
        num[i]=in.nextInt();
     }
       Arrays.sort(num);
       for(int i=0; i<num.length; i++)
       {
          System.out.print(num[i]+" ");
       }
       subArray(num);

    }
    
}
