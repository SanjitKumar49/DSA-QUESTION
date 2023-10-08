import java.util.Scanner;

import javax.swing.text.html.HTMLEditorKit;

public class ifc {
    public static void main(String[] args) {
        String str;
        System.out.print("enter the password:");

        Scanner p = new Scanner(System.in);
        // ifc o=new ifc();
        str = p.nextLine();
        if (str.equals("sanjit")) {
            System.out.println("successfully login:");

        } else {
            System.out.print("please Retry");
        }

    }

}
