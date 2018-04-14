import java.time.LocalDateTime;

public class SecurityGuard extends User{
	
	
	//constructor
	public SecurityGuard(String IdNumber, String firstName, String lastName) {
		super(IdNumber, firstName, lastName);
		
	}	
	
	//method to change level
	public Alert resolveAlert(Alert alert) {
		alert.resolveAlert();
		return alert;
	}
	
	//increases level of alert
	public Alert escalateAlert(Alert alert) {
		alert.increaseLevel();
		return alert;
	}
	
	//decreases of level of alert
	public Alert descalateAlert(Alert alert){
		alert.decreaseLevel();
		return alert;
	}
			
}
