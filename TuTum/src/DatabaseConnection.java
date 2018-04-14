import java.sql.*;
import java.util.*;

// Class used to create a connection to a database
public class DatabaseConnection {
	
	// Fields
	private String connectionUrl = "jdbc:sqlserver://localhost:1401;database=TUTUM_TEST;"
			+ "user=SA;password=Ph11lycode2018";
	
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	  
	// Constructor for Database Connection for the application
	public DatabaseConnection() {
	  	establishConnection();
	}
	  
	// Method to establish a Connection to the Database
	public void establishConnection() {
		System.out.println("Establishing a Connection to the Database...");
	  	try {
	  		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	  		conn = DriverManager.getConnection(connectionUrl);
	  		System.out.println("Connection Esablished to Database");
	  	} catch (Exception e) {
	  		e.printStackTrace();
	  	}
	}
	
	public void testConnection(){
		String request = "delete test_table";
		try {
    		System.out.println("Inserting Assignment to database...");
			stmt = conn.createStatement();
			stmt.executeQuery(request);
			System.out.println("Insert Assignment Complete");
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
}
