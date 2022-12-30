import java.io.OutputStream;
import java.util.Scanner;

public class LinerSearch {
    public static void  main(String[] args) {
        Scanner in =new Scanner(System.in);
        //  char str[]={'a','b','c','d','e'};
        String str[]={"sanjit","nikesh","vikash","adit"};

          int count=0;
          char target=in.next().charAt(0);

          for(int i=0; i<str.length;i++)
          {
            str=in.nextLine();
          }
        for(int i=0; i<str.length;i++)
        {
          if(str[i]==target){
          System.out.println("index no:" +i);
          count++;
            
          }
          
        }
        if(count==0)
        System.out.println("data not found: ");
    
    }
    
}
