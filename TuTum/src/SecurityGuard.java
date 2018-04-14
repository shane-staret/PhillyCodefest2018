import java.time.LocalDateTime;

public class SecurityGuard {
	private String IdNumber;
	
	//constructor
	public SecurityGuard(String IdNumber) {
		this.IdNumber = IdNumber;
	}
	
	//mutator method
	public void setIdNumber(String IdNumber) {
		this.IdNumber = IdNumber;
	}
	
	//access method
	//return @IdNumber
	public String getIdNumber() {
		return IdNumber;
	}
	
	//alert method
	public Alert alert(int level) {
		LocalDateTime time = java.time.LocalDateTime.now();
		return new Alert(level,time);
		
	
			
	}
}
