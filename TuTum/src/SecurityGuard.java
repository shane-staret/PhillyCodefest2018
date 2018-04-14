import java.time.LocalDateTime;

public class SecurityGuard {
	private String IdNumber;
	
	//constructor
	public SecurityGuard(String IdNumber) {
		this.IdNumber = IdNumber;
	}
	
	//mutator method
	public void setIdNumber(String IdNumber) {
		this.IdNumber = IdNumber;
	}
	
	//access method
	public String getIdNumber() {
		return IdNumber;
	}
	
	//alert method
	public Alert alert(int level) {
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
