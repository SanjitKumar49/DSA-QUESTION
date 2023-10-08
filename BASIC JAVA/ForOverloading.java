import java.util.Scanner;

public class ForOverloading {
    Scanner in = new Scanner(System.in);
    String a, b;

    ForOverloading() {
        System.out.println("enter two charecters: ");
        this.a = in.next();
        this.b = in.next();

        System.out.println(a + " " + b);
    }

    void ForOverloading(int a,int  b) {
        System.out.println("enter two charecters: ");
       
        System.out.println(a + b);
    }
}

class fine extends ForOverloading {
    public static void main(String[] args) {
        fine obj = new fine();
        ForOverloading(10,10);

        // fine.ForOverloading(v,c);

    }
}
