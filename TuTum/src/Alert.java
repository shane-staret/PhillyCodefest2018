import java.time.LocalDateTime;

public class Alert {
	protected int level;
	protected String message;
	protected LocalDateTime date;
	protected long startTime;
	protected long endTime;
	protected String timeElapsed;
	
	public Alert(int level, String message) {
		setStartTime(System.currentTimeMillis());
		if(level != Level.POTENTIAL.getNumeric() || level != Level.SUSPICIOUS.getNumeric() || level != Level.EMERGENCY.getNumeric()) {
			level = -1;
			return;
		}
		else {
			this.level = level;
			this.message = message;
			this.date = java.time.LocalDateTime.now();
		}
	}
	
	public Alert(int level) {
		setStartTime(System.currentTimeMillis());
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
	
	public long getStartTime() {
		return startTime;
	}
	
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	
	public long getEndTime() {
		return startTime;
	}
	
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
	
	//gives elapsed time in minutes
	public String getElapsedTime() {
		timeElapsed = (float)(getEndTime() - getStartTime())/1000/60/60 + "Hrs";
		return timeElapsed;
	}
	
	
}
