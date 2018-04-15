
public class StudentAlert extends Alert {
	//level of danger
	private String student_id;
	
	//constructor
	public StudentAlert(int level, String message, String student_id) {
		super(level, message);
		this.student_id = student_id;
	}
	//print method
	
	
}