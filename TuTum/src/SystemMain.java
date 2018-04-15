import java.util.*;


// Main class of System
public class SystemMain {
	
	// Global Fields
	private static ArrayList<Student> studentDirectory;
	private static ArrayList<Teacher> teacherDirectory;
	private static ArrayList<SecurityGuard> guards;
	private static ArrayList<Alert> alerts;
	
	// Database Backend API Variable
	private static DatabaseConnection db; 
	
	// Static Methods
	
	
	// Main Methods
	public static void main(String[] args){
		db = new DatabaseConnection(); // Establish Connection to Database
		
		// TEST FOR DATABASE TO RETREIVE DATA
//		// Aquire Directory Data from DB
//		teacherDirectory = db.getTeachersFromDB(); 
//		studentDirectory = db.getStudentsFromDB();
//		guards = db.getGuardsFromDB();
//		// Printing teachers
//		for(Teacher t: teacherDirectory){
//			System.out.println(t.userID);
//		}
//		for(Student s: studentDirectory){
//			System.out.println(s.getStudentID());
//		}
//		for(SecurityGuard g: guards){
//			System.out.println(g.userIDNumber());
//		}
//		
		
		// Login Frame Initialization
				
		//LoginInterface login = new LoginInterface(); // without database
		
		LoginInterface loginDB = new LoginInterface(db); // With Database
	}
}