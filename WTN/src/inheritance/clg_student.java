package inheritance;

public class clg_student extends student{

	clg_student(String person_name, String date_of_birth) {
		super(person_name, date_of_birth);
	}
	int studyingYear;
	String CollegeName;
	public int getStudyingYear() {
		return studyingYear;
	}
	public void setStudyingYear(int studyingYear) {
		this.studyingYear = studyingYear;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
    void display() {
    	System.out.println("College Student details");
    	System.out.println();
    	System.out.println("College Name:-"+getCollegeName());
        displayStudent();
    	System.out.println("Studying Year:-"+getStudyingYear());
    	System.out.println();	
    }
}