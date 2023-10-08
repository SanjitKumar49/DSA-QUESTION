import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        int marks;
        System.out.println("please enter your marks:");
        Scanner obj=new Scanner(System.in);
        marks=obj.nextInt();
        if (marks>=80)
         {
            if (marks<90) {
                System.out.println("grad A");
                
            }
            else{
                System.out.println("grad B");
            }

            
        }
        else{
            if (marks>45 || marks<60) {
                System.out.print("grad C");
              }
              else if (marks>30 || marks<45) {
                System.out.println("grad D");
                
              }
              else{
                System.out.println("fail");
              }
            
        }
    }

    }
    

