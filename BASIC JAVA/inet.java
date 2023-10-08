import java.net.InetAddress;

public class inet {
    public static void main(String[] args) {
        try{
            InetAddress ip=InetAddress.getByName("www.google.com");
            System.out.println("host name:"+ip.getHostName());
            System.out.println(" ip address:"+ip.getHostAddress());
           // System.out.println("host name:"+ip.get());
         }
         catch(Exception e)
         {
            System.out.println(e);
            

         }
    }
    
}
