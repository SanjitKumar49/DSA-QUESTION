import java.util.Scanner;

public class StringLinear {
    static int i = 0;

    public static void Main(char ch[], char t) {
        for (char c = 0; c < ch.length; c++) 
        {
            if (ch[c] == t)
             {
                System.out.println("index is: " +c);
                i += 1;
              }

        }
        if (i == 0)
            System.out.println("data is not found: ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the charector: ");
        char str[] = new char[10];
        char target = 's';
        for (char c = 0; c < str.length; c++) {
            str[c] = in.next().charAt(0);
        }
        Main(str, target);
    }
}
