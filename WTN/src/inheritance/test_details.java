package inheritance;

public class test_details {


	public static void main(String args[]) {
		employee E1=new employee();
		E1.setPerson_name("vardhan");
		E1.setAnnual_salary(1000000);
		E1.setNational_insurance_number("92478525");
		E1.setStarted_year(2015);
		E1.display();
		employee E2=new employee();
		E2.setPerson_name("vardy");
		E2.setAnnual_salary(1300000);
		E2.setNational_insurance_number("98452361");
		E2.setStarted_year(2012);
		E2.display();
	}	
}