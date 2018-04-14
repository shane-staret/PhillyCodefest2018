import java.time.LocalDateTime;

public class Alert {
	private int level;
	private String message = "";
	private LocalDateTime date;
	
	public Alert(int level, String message, LocalDateTime date) {
		this.level = level;
		this.message = message;
		this.date = date;
	}
	
	public Alert(int level, LocalDateTime date) {
		this.level = level;
		this.date = date;
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
		this.level = 0;
	}
	//
	public void increaseLevel() {
		if(this.level < 3)
			this.level++;
	}
	public void decreaseLevel() {
		if(this.level > 0)
			this.level--;
	}
	
	
	//method to write message
	public void writeMessage(String message) {
		this.message = message;
	}
	
	public String toString() {
		return (level + "\t" + message + "\t" + date.toString());
	}
}
