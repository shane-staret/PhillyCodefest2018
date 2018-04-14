import java.util.ArrayList;

/*
 * Name (String)
ID number (int)
allStudentLocations (ArrayList<String>)
Current Location (string)
Status Flag (boolean)
Getters
studentLocationStatus Method

 */

public class Student {
	private String studentID;
	private String studentName;
	private String studentCurrentLocation;
	private String studentPreviousLocation;
	private String absenceAlert;
	private boolean studentIsAbsent;
	private ArrayList<String> allStudentLocations = new ArrayList<>();
	private boolean studentStatusFlag;
	
	public Student(String studentID, String studentName, boolean studentStatusFlag) {
		this.setStudentID(studentID);
		this.setStudentName(studentName);
		this.setStudentStatusFlag(studentStatusFlag);
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCurrentLocation() {
		return studentCurrentLocation;
	}

	public void setStudentCurrentLocation(String studentCurrentLocation) {
		if(!allStudentLocations.isEmpty())
			studentPreviousLocation = studentCurrentLocation;
		this.studentCurrentLocation = studentCurrentLocation;
		allStudentLocations.add(studentCurrentLocation);
	}

	public boolean getStudentStatusFlag() {
		return studentStatusFlag;
	}

	public void setStudentStatusFlag(boolean studentStatusFlag) {
		this.studentStatusFlag = studentStatusFlag;
	}
	
	private void studentLocationStatus() {
		for(int i = 0; i < allStudentLocations.size(); i++) {
			if(!allStudentLocations.get(i).equals("unknown")) {
				studentIsAbsent = false;
				if(i == allStudentLocations.size() - 1 && !(allStudentLocations.get(allStudentLocations.size() - 1)).equals("unknown"))
					absenceAlert = "Present, but student is not in current class. Last known location: " + studentPreviousLocation;
			}
			
		}
		studentIsAbsent = true;
		absenceAlert = "Absent, student was never in building";
	}

	public boolean isStudentAbsent() {
		studentLocationStatus();
		return studentIsAbsent;
	}
	

}
