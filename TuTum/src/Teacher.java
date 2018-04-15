
public class Teacher extends User {

	private String room;
	private String id;
	private String firstName;
	private String lastName;
	
	//constructor
	public Teacher(String IDNumber, String firstName, String lastName, String room) {
		super(IDNumber, firstName, lastName);
		this.room = room;
	}
	
	//gets teachers room number
	public String getRoom() {
		return room;
	}
	
	//sets teachers room number
	public void setRoom(String room) {
		this.room = room;
	}
	
	public void changeStatusFlag(Student student) {
		student.setStudentStatusFlag(!student.getStudentStatusFlag());
	}
	
	public void setStudentStatus(Student student, boolean status) {
		student.setStudentIsAbsent(status);
		if(!status)
			student.setStudentCurrentLocation(room);
		else
			student.setStudentCurrentLocation(null);
	}
	
	public SecurityAlert createAlert(int level, String message) {
		return new SecurityAlert(level, message, room);
	}
}
