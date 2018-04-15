
public class Teacher extends User {

	private String course;
	private String id;
	private String firstName;
	private String lastName;
	
	//constructor
	public Teacher(String IDNumber, String firstName, String lastName, String course) {
		super(IDNumber, firstName, lastName);
		this.course = course;
	}
	
	//gets teachers course number
	public String getcourse() {
		return course;
	}
	
	//sets teachers course number
	public void setCourse(String course) {
		this.course = course;
	}
	
	public void changeStatusFlag(Student student) {
		student.setStudentStatusFlag(!student.getStudentStatusFlag());
	}
	
	public void setStudentStatus(Student student, boolean status) {
		student.setStudentIsAbsent(status);
		if(!status)
			student.setStudentCurrentLocation(course);
		else
			student.setStudentCurrentLocation(null);
	}
	
	public SecurityAlert createAlert(int level, String message) {
		return new SecurityAlert(level, message, course);
	}
}
