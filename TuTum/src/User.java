import java.time.LocalDateTime;

public class User {
	private String IdNumber;
	
	//constructor
	public User(String IdNumber) {
		this.IdNumber = IdNumber;
	}
	
	//getter method
	public String getIdNumber() {
		return IdNumber;
	}
	//mutator method
		public void setIdNumber(String IdNumber) {
			this.IdNumber = IdNumber;
		}
		
	//creates Alert method
		public StudentAlert createAlert(int level) {
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
		
		
