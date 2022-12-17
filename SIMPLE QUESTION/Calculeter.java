import java.text.NumberFormat.Style;
import java.util.Scanner;

public class Calculeter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the two number: ");
        int num1=in.nextInt();
        int num2=in.nextInt();
        System.out.print("what you want:"+"1=+,2=-,3=*,4=/");
        int op=in.nextInt();
        float sum;

        if(op==1){
            sum=num1+num2;
            System.out.println("Addition "+num1+" and "+num2 +" is:"+sum);
            
        }
        else if(op==2){
            sum=num1-num2;
            System.out.println("Subtraction "+num1+" and "+num2 +" is:"+sum);
            

        }
        else if(op==3){
            sum=num1*num2;
            System.out.println("Multiplection "+num1+" and "+num2 +" is:"+sum);
            

        }
        else if(op==4){
            sum=num1/num2;
            System.out.println("divisible "+num1+" By "+num2 +" is:"+sum);
            

        }
        else{
            System.out.println("enter the valid Opertion.!");
        }

    }
    
}
