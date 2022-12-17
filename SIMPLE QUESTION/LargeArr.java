import java.util.Scanner;

public class LargeArr {
     int Ln = Integer.MIN_VALUE;

    public  void LargeNo(int Number[]) {
        for (int i = 0; i < Number.length; i++) {
            if (Ln < Number[i]) {
                Ln = Number[i];

            }
        }
        

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("entre the eliments: ");
        int num[] = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        LargeArr obj=new LargeArr();
        
        obj.LargeNo(num);
        System.out.println("my large number is: "+obj.Ln);
    }
}
