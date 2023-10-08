import java.io.DataOutputStream;
import java.net.Socket;


public class sender1 {
    public static void main(String[] args) {
        try{
            Socket s=new Socket("localhost",6666);
            DataOutputStream doub=new DataOutputStream(s.getOutputStream());
            doub.writeUTF("hey boys");
            doub.flush();
            doub.close();
            s.close();

        } catch(Exception e){
            System.out.println(e);

        }
    }
    
}
