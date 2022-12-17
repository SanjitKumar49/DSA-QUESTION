import java.util.Scanner;
public class Leap {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int year=in.nextInt();
        if((year%100==0 && year%400==0) || (year%100!=0&& year%4==0)){
            System.out.println("yes leap year:"+year);
        }
        else{
            System.out.println("not a leap year :"+year);
        }
    }
}
