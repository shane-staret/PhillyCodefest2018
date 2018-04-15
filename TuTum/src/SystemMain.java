import java.util.*;


// Main class of System
public class SystemMain {
	
	// Global Fields
	private static ArrayList<Student> studentDirectory;
	private static ArrayList<Teacher> teacherDirectory;
	private static ArrayList<SecurityGuard> guards;
	
	private static DatabaseConnection db; 
	
	// Static Methods
	
	
	// Main Methods
	public static void main(String[] args){
		
		//String studentID, String studentFirstName, String studentLastName, boolean studentStatusFlag
//		Student[] students = {new Student("34", "Leander", "Jeyasingh", false),
//				new Student("45", "Carlos", "AllMight", false),
//				new Student("67", "Shane", "Staret", true)};
		
		
		db = new DatabaseConnection();
		
		// Aquiring Users
		teacherDirectory = db.getTeachersFromDB(); 
		studentDirectory = db.getStudentsFromDB();
		guards = db.getGuardsFromDB();
		
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