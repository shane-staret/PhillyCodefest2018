import java.time.LocalDateTime;

public class Alert {
	//level of danger
	private int level = 0;
	
	private LocalDateTime date;
	
	//constructor
	public Alert(int level, LocalDateTime date) {
		this.level = level;
		this.date = date;
	}
	
	
}
	
