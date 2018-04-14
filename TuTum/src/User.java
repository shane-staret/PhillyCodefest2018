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
		public void setIdNumber(String IdNumber) {
			this.userID = IdNumber;
		}
		
	//creates Alert method
		public Alert createAlert(int level) {
			LocalDateTime time = java.time.LocalDateTime.now();

			if (level == 3) {
				return new EmergencyAlert(time);
			}
			else if(level == 2) {
				return new SuspiciousAlert(time);
			}
			else if(level ==1) {
				return new PotentialAlert(time);
			}
			else {
				return null;
			}
		}
}	
		
		
