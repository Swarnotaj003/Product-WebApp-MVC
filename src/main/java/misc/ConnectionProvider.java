package misc;

import java.sql.*;

public class ConnectionProvider {
	static Connection con;

	//Update these attributes as per your local MySQL database
	private static String username = "root";
	private static String password = "taj325";
	private static int port = 3306;
	private static String host = "localhost";
	private static String database = "mvcsample";
	
	public static Connection createCon() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database, username, password);
		} catch(Exception e) {
			System.out.println("Connection failed!");
			e.printStackTrace();
		}
		return con;
	}
}