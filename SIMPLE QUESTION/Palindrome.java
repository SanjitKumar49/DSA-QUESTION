import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int temp, st = 0,c;
        while (num > 0) {
            temp = num % 10;
            st = (st*10) + temp;
            temp = num / 10;

        }
        if(num==st){
            System.out.println("yes");
        }
        else
        System.out.println("no");
    }
}
