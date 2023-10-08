import java.io.InputStream;
import java.net.HttpCookie;
import java.net.URL;
import java.net.URLConnection;

public class urlcon {
    public static void main(String[] args) {
        try{
            URL u=new URL("https://www.youtube.com/shorts/is1WvUZHDbI");
            URLConnection uc=u.openConnection();
            InputStream stream=uc.getInputStream();
            int b;
            while((b=stream.read()) !=-1){
                System.out.println((char) b);
             }
            }
            catch(Exception e)
            {
                System.out.println(e);

            }
        }
    }
    

