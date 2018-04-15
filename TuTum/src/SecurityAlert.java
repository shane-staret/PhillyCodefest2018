public class SecurityAlert extends Alert {
	private Sector sector;
	private String room;
	
	/*
	 * TODO:
	 * Change level logic as changed in Alert.java
	 */
	
	public SecurityAlert(int level, String message, Sector sector) {
		super(level, message);
		this.sector = sector;
	}
	
	public SecurityAlert(int level, String message, String room) {
		super(level, message);
		this.setRoom(room);
	}
	
	public SecurityAlert(int level, String message) {
		super(level, message);
	}
	
	public Sector getSector() {
		return sector;
	}
	
	public void increaseLevel() {
		if(super.level < 2)
			super.level++;
	}
	public void decreaseLevel() {
		if(super.level > -1)
			super.level--;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}
}
