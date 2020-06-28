package inheritance;

public class student extends person_dob{

	int studentID;
	student(String person_name, String date_of_birth) {
		super(person_name, date_of_birth);
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
    void displayStudent() {
    	System.out.println("Student details");
    	System.out.println();
    	displayPersondob();
    	System.out.println("Student ID:-"+getStudentID());
    	System.out.println();
    }
	
	
	
	
}