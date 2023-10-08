import java.util.Scanner;

public class precticefirst {
    static String str;
    int marks;

    public static void main(String[] args) {
        int std;
        Scanner s = new Scanner(System.in);
        
        System.out.println("please enter the your standard:");
        std = s.nextInt();

        precticefirst o = new precticefirst();
        System.out.println("please enter the your age:");
        o.marks = s.nextInt();
        System.out.println("enter your name:");
        str=s.next();
        System.out.println("your name is:"+str.toUpperCase()+ " yourStd:"+std+ " yourMarks:" +o.marks);
        System.out.println(str.length());
        System.out.print(str.replace(str, "sanjit"));


    }

}
