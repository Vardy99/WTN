package inheritance;

public class test_student {

	public static void main(String args[])
	{
		//College student details name,dob,college,ID,year
		clg_student C1=new clg_student("Ravindra","17-05-1999");
		C1.setCollegeName("KLU");
		C1.setStudentID(170040293);
		C1.setStudyingYear(4);
		C1.display();
	    //Student details name,dob,id,
	    student S1=new student("Rahul","21-06-1999");
	    S1.setStudentID(156383);
		S1.displayStudent();
		//Teacher Details
		teacher T1=new teacher("Ram","30-06-2000");
		T1.setSalary(600000);
		T1.setSubject("Physics");
		T1.displayTeacher();
	}
	
	
	
}