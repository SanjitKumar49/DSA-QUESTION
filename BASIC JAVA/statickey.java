import java.util.Scanner;

public class statickey {
    
    static String str="hey sanjit";
    

      static void bhau(){
        float a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("first number");
        a=s.nextFloat();
        System.out.println("second number");
        b=s.nextFloat();
        c=a+b;
        System.out.println("sum of two no:" +c);
        }
        public static void main(String[] args) {
            bhau();
            System.out.println(str);
            
        }

    
}
/* 
class ab{
    public static void main(String[] args) {
        statickey o=new statickey();
        System.out.println(o.str);
        o.bhau();


    }
}*/