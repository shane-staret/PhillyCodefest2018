
public class Sector {
	private final String location;
	private boolean trigger = false;
	
	public Sector(String location) {
		this.location = location;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void changeTriggerStatus()  {
		trigger = !trigger;
		if (trigger){
			createSecurityAlert();
		}
	}
	
	private SecurityAlert createSecurityAlert() {
		return new SecurityAlert(1, "Trigger at: " + location, this);
	}

}
