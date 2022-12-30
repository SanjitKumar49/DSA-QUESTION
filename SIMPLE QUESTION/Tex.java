import java.util.Scanner;

public class Tex {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the salary: ");
        int salary=in.nextInt();
        int totalSalary=0;
        if(salary==10000){
            totalSalary=(salary*5)/100;
            System.out.println("taxe is : "+totalSalary);
             }
             else if(salary>10000 ||salary<100000){
                totalSalary=salary*20/100;
                System.out.println("taxe is: "+totalSalary);

             }
             else{
                totalSalary=salary*10/100;
                System.out.println("taxe is: "+totalSalary);

             }
    }
    
}
