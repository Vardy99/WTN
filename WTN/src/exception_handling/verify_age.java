package exception_handling;

class age {
	 void checkAge(int age) throws invalidage_exception{
		 if(age>=18&&age<=60) {
			 System.out.println("You are Eligible");
		 }
		 else
		 {
			 throw new invalidage_exception("You should be above 18 years for eligibility");
		 }
	 }
	
}


public class verify_age {
public static void main(String args[]) {
	age a1=new age();
	try {
		a1.checkAge(8);
	}
	catch(invalidage_exception e)
	{
		System.out.println(e);
	}
}
}