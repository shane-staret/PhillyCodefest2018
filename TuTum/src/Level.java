
public enum Level {
	POTENTIAL (0),
	SUSPICIOUS (1),
	EMERGENCY (2);
	
	private final int numeric;
	Level(int numeric) {
		this.numeric = numeric;
	}
	
	public int getNumeric() {
		return numeric;
	}
}
