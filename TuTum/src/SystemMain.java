import java.util.*;


// Main class of System
public class SystemMain {
	
	// Global Fields
	public static final int status0 = Level.POTENTIAL.getNumeric();
	public static final int status1 = Level.SUSPICIOUS.getNumeric();
	public static final int status2 = Level.EMERGENCY.getNumeric();
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
		
		// Aquire Directory Data from DB
		teacherDirectory = db.getTeachersFromDB(); 
		studentDirectory = db.getStudentsFromDB();
		guards = db.getGuardsFromDB();
		
		// Login Frame Initialization
		LoginInterface login = new LoginInterface();
		
		
		
		// Printing teachers
		for(Teacher t: teacherDirectory){
			System.out.println(t.getRoom());
		}
		for(Student s: studentDirectory){
			System.out.println(s.getStudentID());
		}
		for(SecurityGuard g: guards){
			System.out.println(g.userIDNumber());
		}
		
	}
}