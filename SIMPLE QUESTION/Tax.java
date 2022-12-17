import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int salary=in.nextInt();
        int tax=0;
        if (salary<=10000) {
            System.out.println("no tax" +salary);

        }
        else if(salary>=10000 && salary<=100000){
            tax=salary/10;
            System.out.println("10% tax" +tax );
        }
        else{
            System.out.println("20% tax");
        }
    }
}
