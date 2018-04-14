
public class Teacher {
	private String id;
	private String room;
	public Teacher(String id, String room) {
		id = id;
		room = room;
	}
	//Teacher inputs studentID of student who is not here
	public String studentNotHere(String studentID) {
		return studentID;
	}
	
	
	
	//Getters and setters
	public String getID() {
		return id;
	}
	public String getRoom() {
		return room;
	}
	public void setID(String id) {
		this.id = id;
	}
	public void setRoom(String room) {
		this.room = room;
	}
}
