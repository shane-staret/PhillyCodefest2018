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
	private String studentCurrentLocation; //last known location of student
	private String studentPreviousLocation; //previous location of student
	private String absenceAlert; //eventually will be an Alert object
	private boolean studentIsAbsent; //true: student is absent from building; false; student is not absent from building
	private ArrayList<String> allStudentLocations = new ArrayList<>(); //holds all locations student has been logged at for the day
	private boolean studentStatusFlag; //true: student is seen as harmful; false: student is not seen as harmful
	
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

	//sets current location of student to new value based on most recent attendance by teacher (Teacher class needs to access this)
	public void setStudentCurrentLocation(String studentCurrentLocation) {
		if(!allStudentLocations.isEmpty())
			studentPreviousLocation = studentCurrentLocation;
		this.studentCurrentLocation = studentCurrentLocation;
		allStudentLocations.add(studentCurrentLocation);
	}

	public boolean getStudentStatusFlag() {
		return studentStatusFlag;
	}
	
	//sets current status flag of student to new value due to an incident (SecurityGuard class must access this)
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

	//true: student was never in building; false: student in building at some point
	public boolean isStudentAbsent() {
		studentLocationStatus();
		return studentIsAbsent;
	}
	
	//will eventually return an Alert object
	public String getAbsenceAlert() {
		return absenceAlert;
	}
	
	
}
