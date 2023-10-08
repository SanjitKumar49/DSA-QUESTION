import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class server1 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss=new ServerSocket(3333,2,InetAddress.getByName("10.14.97.211"));
        Socket s=ss.accept();
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str1="";
        String str2="";
        while(!str1.equals("stop")){
            str1=din.readUTF();
            System.out.println("client says:" +str1);
            str2=br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }
        din.close();
        s.close();
        ss.close();
        
    }
    
}
