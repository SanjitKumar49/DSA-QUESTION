import java.util.Scanner;

public class Calcu {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.print("enter the first no: ");
        int num1=in.nextInt();

        System.out.print("enter the second no: ");
        int num2=in.nextInt();

        System.out.print("enter the choice: ");
        String choice=in.next();

        int sum;
        switch(choice){
            case a:
            sum=num1+num2;
            System.out.println("Addition of two number: "+sum);
            break;

            case 2:
            sum=num1-num2;
            System.out.println("Subtrction of two number: "+sum);
            break;

            case 3:
            sum=num1*num2;
            System.out.println("Multiplication of two number: "+sum);
            break;

            case 4:
            sum=num1/num2;
            System.out.println("Divistion of two number: "+sum);
            break;

            default:
            System.out.println("enter right choice.!");
        }


    }
    
}
