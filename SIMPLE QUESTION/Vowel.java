import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        System.out.print("enter the eliments: ");
         Scanner in=new Scanner(System.in);
         char s=in.next().charAt(0);
         if(s=='A' || s=='E' || s=='I' || s=='O' || s=='U')
         {
            System.out.print("yes it is a vowel eliments: ");

         }
         else{
            System.out.print("no it's a normal void :");
         }

         for(char i='A'; i<='Z'; i++)
         {
            System.out.print(i+" ");
         }
    }
}
