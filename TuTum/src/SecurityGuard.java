import java.time.LocalDateTime;

public class SecurityGuard extends User{
	
	
	//constructor
	public SecurityGuard(String IdNumber) {
		super(IdNumber);
		
	}	
	
	//method to change level
	public Alert resolveAlert(Alert alert) {
		alert.setLevel(0);
		return alert;
	}
	
	//
	public Alert escalateAlert(Alert alert) {
		alert.setLevel(3);
		return alert;
	}
	
	public StudentAlert(int level, LocalDateTime date) {
		return new StudentAlert(level, date);
	}
			
}
