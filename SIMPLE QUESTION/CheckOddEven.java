import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=input.nextInt();
        if(num%2==0){
System.out.println("it a even no: " +num);
        }
        else{
            System.out.println("odd no: "+num);
        }
    }
}
