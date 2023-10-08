import java.sql.Driver;
import java.sql.DriverManager;

public class connect1 {
    public static void main(String[] args) {
        connect1 conn=null;
        try{
            String username="root";
            String password="Siv@2002";
            String url="jdbc:mysql://localhost:3306/test";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn=(connect1) DriverManager.getConnection(url, username, password);
            System.out.println("database estabilish sucessfully:");
        }
        catch(Exception e){
            System.out.println("can not connect to database:");

        } finally{
            if(conn!=null){
                try{
                    conn.clone();
                    System.out.println("data base terminated");
                }
                catch(Exception e){

                }

                
            }
        }
    }
    
}
