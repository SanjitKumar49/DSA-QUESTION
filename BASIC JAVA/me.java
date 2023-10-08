import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class me {
    public static void main(String[] args) throws Exception {
        ServerSocket ss=new ServerSocket(3333);
        Socket s=ss.accept();
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String str="",str2="";
        while(!str2.equals("stop"));
        {
            str=din.readUTF();
            System.out.println("tu say:" +str2);
            str2=bf.readLine();
            dos.writeUTF(str2);
            dos.flush();


        }
        din.close();
        s.close();
        ss.close();
        
    }
    
}
