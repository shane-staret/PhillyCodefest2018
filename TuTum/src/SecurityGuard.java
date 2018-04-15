public class SecurityGuard extends User{
	
	
	//constructor
	public SecurityGuard(String IdNumber, String firstName, String lastName) {
		super(IdNumber, firstName, lastName);
		
	}	
	
	//method to change level
	public Alert resolveAlert(Alert a) {
		a.resolveAlert();
		a.setEndTime(System.currentTimeMillis());
		a.getElapsedTime();
		return a;
	}
	
	//increases level of alert
	public SecurityAlert escalateAlert(SecurityAlert a) {
		a.increaseLevel();
		return a;
	}
	
	//decreases of level of alert
	public SecurityAlert deescalateAlert(SecurityAlert a) {
		a.decreaseLevel();
		return a;
	}
	
	//creates alert
	public SecurityAlert createAlert(int level, String message) {
		return new SecurityAlert(level, message);
	}
}
