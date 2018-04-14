
public class Teacher extends User {

	private String room;
	private String id;
	private String firstName;
	private String lastName;
	
	//constructor
	public Teacher(String IdNumber, String firstName, String lastName, String room) {
		super(IdNumber, firstName, lastName);
		this.room = room;
	}
	//Teacher inputs studentID of student who is not here
	public String studentNotHere(String studentID) {
		return studentID;
	}
	//gets teachers room number
	public String getRoom() {
		return room;
	}
	//sets teachers room number
	public void setRoom(String room) {
		this.room = room;
	}
	
}
