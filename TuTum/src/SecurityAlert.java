import java.time.LocalDateTime;

public class SecurityAlert extends Alert {
	private Sector sector;
	private String message;
	private int level;
	
	public SecurityAlert(int level, String message, LocalDateTime date, Sector sector) {
		super(level, message, date);
		this.level = level;
		this.message = message;
		this.sector = sector;
	}
	
	public Sector getSector() {
		return sector;
	}
	
	public void increaseLevel() {
		if(level < 2)
			level++;
	}
	public void decreaseLevel() {
		if(this.level > -1)
			this.level--;
	}
}
