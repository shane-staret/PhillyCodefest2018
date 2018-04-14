import java.time.LocalDateTime;

public class SuspiciousAlert extends Alert{
	//constructor
		public SuspiciousAlert(LocalDateTime date) {
			super(2, date);
		}
}
