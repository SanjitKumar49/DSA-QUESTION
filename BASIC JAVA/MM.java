import java.sql.*;

public class MM {
	public static void main(String arg[])
	{
		Connection connection = null;
		try {
			// below two lines are used for connectivity.
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1/first",
				"root", "Siv@2002");

			// mydb is database
			// mydbuser is name of database
			// mydbuser is password of database

			System.out.println("cennect");
		}
		catch (Exception exception) {
			System.out.println(exception);
		}
	} // function ends
} // class ends
