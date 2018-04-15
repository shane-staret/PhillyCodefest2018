import java.time.LocalDateTime;

public class Alert {
	protected int level;
	protected String message;
	protected LocalDateTime date;
	/* TODO:
		use enum data type for level
	*/
	public Alert(int level, String message) {
		this.level = level;
		this.message = message;
		this.date = java.time.LocalDateTime.now();
		Statistics.printAlert(this);
	}
	
	public Alert(int level) {
		this.level = level;
		this.date = java.time.LocalDateTime.now();
	}
	
	//getter for date
	public LocalDateTime getDate() {
		return date;
	}
	//getter for level
	public int getLevel() {
		return level;
	}
	//method to change level
	public void resolveAlert() {
		this.level = -1;
	}
	
	//method to write message
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String toString() {
		return (level + "\t" + message + "\t" + date.toString());
	}
}
