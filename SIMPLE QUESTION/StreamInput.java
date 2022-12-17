import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamInput {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(isr);
        System.out.print("enter your name:");
         String str=bf.readLine();
         System.out.print("enter your registion id: ");
         int a=Integer.parseInt(bf.readLine());
         System.out.print("enter your marks:");
         float f=Float.parseFloat(bf.readLine());
         System.out.println("your name:" +str +" " +"your reg no: "+a +" " +"your marks: " +f);
    }
    
}
