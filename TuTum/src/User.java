import java.time.LocalDateTime;

public class User {
	protected String userID;
	protected String userFirstName;
	protected String userLastName;
	
	//constructor
	public User(String IdNumber, String firstName, String lastName) {
		this.userID = IdNumber;
		this.setUserFirstName(firstName);
		this.setUserLastName(lastName);
	}
	
	//get userID
	public String userIDNumber() {
		return userID;
	}
	//set userID
	public void setIdNumber(String userID) {
		this.userID = userID;
	}
	
	
	//create alert
	public SecurityAlert createAlert() {
		SecurityAlert security = null;
		return security;
	}

	//get firstName
	public String getUserFirstName() {
		return userFirstName;
	}

	
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
}
		
		
