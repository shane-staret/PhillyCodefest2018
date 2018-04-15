import java.sql.*;
import java.util.*;

// Class used to create a connection to a database
public class DatabaseConnection {
	
	// Fields
	
	// FEILDS TO CONNECT TO THE DATABASE
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
	
	
	// API LOGIC
	
	// TEST METHOD
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
	
	// TEACHER INTERFACE \\ 
	public Teacher getTeacherDataById(String id){
		String request = "SELECT * FROM TEACHER_USER WHERE TEACHER_ID = '" + id + "';";
		Teacher t = null;
		try {
    		System.out.println("Getting Teacher data from database...");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(request);
			if(rs.next()){
				String tid = rs.getString("TEACHER_ID");
				String fn = rs.getString("FIRST_NAME");
				String ln = rs.getString("LAST_NAME");
				String cid = rs.getString("COURSE_ID");
				t = new Teacher(tid, fn, ln, cid);
			}
			System.out.println("Successful reception of Teacher data");
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return t;
	}
	
	public ArrayList<Student> getStudentsByCourse(String cid){
		String request = "SELECT * " +
						"FROM STUDENT_COURSE, TEACHER_USER, STUDENT " +
						"WHERE STUDENT_COURSE.COURSE_ID = TEACHER_USER.COURSE_ID " +
						" AND TEACHER_USER.TEACHER_ID = '" + cid + "';";
		ArrayList<Student> queryResults = new ArrayList<Student>();
		try {
    		System.out.println("Inserting Assignment to database...");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(request);
			while(rs.next()){
				String id = rs.getString("STUDENT_ID");
    			String fn = rs.getString("FIRST_NAME");
    			String ln = rs.getString("LAST_NAME");
    			String cr = rs.getString("CURRENT_ROOM");
    			String pr = rs.getString("PREVIOUS_ROOM");
    			boolean f = Boolean.getBoolean(rs.getString("STATUS_FLAG"));
    			boolean ab = Boolean.getBoolean(rs.getString("ABSENT_FLAG"));
    			queryResults.add(new Student(id, fn, ln, cr, pr, f, ab));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return queryResults;
	}
	
	// LOGIN LOGIC \\
	public String loginTeacher(String uname, String pass){
		String q = "SELECT * FROM TEACHER_USER WHERE USERNAME = '" + uname + "' AND PASSWORD = '" + pass + "';";
		String id = "";
		try {
			System.out.println("Attempting Teacher Login");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(q);
			if(rs.next()){
				id = rs.getString("TEACHER_ID");
			} else {
				id = null;
				System.out.println("Unable to login as a Teacher");
			}
		} catch(SQLException e){
			e.printStackTrace();
		}
		return id;
	}
	
	public String loginGuard(String uname, String pass){
		String q = "SELECT * FROM SECURITY_USER WHERE USERNAME = '" + uname + "' AND PASSWORD = '" + pass + "';";
		String id = "";
		try {
			System.out.println("Attempting Guard Login");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(q);
			if(rs.next()){
				id = rs.getString("SECURITY_ID");
			} else {
				id = null;
				System.out.println("Unable to login as a Guard");
			}
		} catch(SQLException e){
			e.printStackTrace();
		}
		return id;
	}
	
	
	// GET USER QUERYS \\
	// GET TEACHERS
	public ArrayList<Teacher> getTeachersFromDB(){
		String q = "SELECT * FROM TEACHER_USER";
		ArrayList<Teacher> queryResults = new ArrayList<Teacher>();
		try {
    		System.out.println("Getting Teachers from database...");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(q);
			while(rs.next()) {
    			String id = rs.getString("TEACHER_ID");
    			String fn = rs.getString("FIRST_NAME");
    			String ln = rs.getString("LAST_NAME");
    			String room = rs.getString("COURSE_ID");
    			queryResults.add(new Teacher(id, fn, ln, room));
    		}
			System.out.println("Teacher data aquired");
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return queryResults;
	}
	// GET GUARDS
	public ArrayList<SecurityGuard> getGuardsFromDB(){
		String q = "SELECT * FROM SECURITY_USER";
		ArrayList<SecurityGuard> queryResults = new ArrayList<SecurityGuard>();
		try {
    		System.out.println("Getting Guard from database...");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(q);
			while(rs.next()) {
    			String id = rs.getString("SECURITY_ID");
    			String fn = rs.getString("FIRST_NAME");
    			String ln = rs.getString("LAST_NAME");
    			queryResults.add(new SecurityGuard(id, fn, ln));
    		}
			System.out.println("Guard data aquired");
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return queryResults;
	}
	
	// GET STUDENTS
	public ArrayList<Student> getStudentsFromDB(){
		String q = "SELECT * FROM STUDENT";
		ArrayList<Student> queryResults = new ArrayList<Student>();
		try {
    		System.out.println("Getting Student from database...");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(q);
			while(rs.next()) {
    			String id = rs.getString("STUDENT_ID");
    			String fn = rs.getString("FIRST_NAME");
    			String ln = rs.getString("LAST_NAME");
    			String cr = rs.getString("CURRENT_ROOM");
    			String pr = rs.getString("PREVIOUS_ROOM");
    			boolean f = Boolean.getBoolean(rs.getString("STATUS_FLAG"));
    			boolean ab = Boolean.getBoolean(rs.getString("ABSENT_FLAG"));
    			queryResults.add(new Student(id, fn, ln, cr, pr, f, ab));
    		}
			System.out.println("Student data aquired");
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return queryResults;
	}
}
