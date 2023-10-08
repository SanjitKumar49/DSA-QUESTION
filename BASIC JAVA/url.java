import java.net.URL;

public class url {
    public static void main(String[] args) {
        try{
            URL u=new URL("https://developer.android.com/reference");
            System.out.println("protocol name:" +u.getProtocol());
            System.out.println("host name:" +u.getHost());
            System.out.println("port no:" +u.getPort());
            System.out.println("file name:" +u.getFile());
            System.out.println("path name:" +u.getPath());

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
