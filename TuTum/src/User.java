import java.time.LocalDateTime;

public class User {
	private String userID;
	private String userFirstName;
	private String userLastName;
	
	//constructor
	public User(String IdNumber, String firstName, String lastName) {
		this.userID = IdNumber;
		this.userFirstName = firstName;
		this.userLastName = lastName;
	}
	
	//getter method
	public String userIDNumber() {
		return userID;
	}
	//mutator method
		public void setIdNumber(String userID) {
			this.userID = userID;
		}
		
}
		
		
