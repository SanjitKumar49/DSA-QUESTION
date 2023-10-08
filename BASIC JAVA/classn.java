import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class classn{
    public static void main(String[] args) {
     InputStreamReader s=new InputStreamReader(System.in);
     BufferedReader t=new BufferedReader(s);
     int a=Integer.parseInt(t.readLine());

        System.out.println(+a);
        }

}