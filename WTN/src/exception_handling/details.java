package exception_handling;
class user {
	void userregistration(String name,String country) throws invalidcountry_exception
	{
		if(country.equalsIgnoreCase("India"))
		{
			System.out.println("registration done successfully");
		}
		else
		{
			throw new invalidcountry_exception("User outside India cannot be registered");
		}
	}
}

public class details {

	public static void main(String[] args) {
		user u1=new user();
		try {
		u1.userregistration("Ravindra", "India");
		}
		catch(invalidcountry_exception e) {
			System.out.println(e);
		}
	}

}