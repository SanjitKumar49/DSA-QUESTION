import java.io.*;

import java.net.*;

public class tu {
    public static void main(String[] args) throws Exception {
        Socket s=new Socket("loacalhost", 3333);
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String str1="";
        String str2="";
        while(!str2.equals("stop"));
        {
            str1=bf.readLine();
            dos.writeUTF(str1);
            dos.flush();
            str2=din.readUTF();
            System.out.println("me say"+str2);

        }
        dos.close();
        s.close();
        
    }
    
}
