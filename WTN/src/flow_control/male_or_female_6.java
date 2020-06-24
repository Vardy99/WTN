package flow_control;

public class male_or_female_6 {
	public static void main(String args[])
	{
		String m="Male";
		String f="Female";
		String str1=args[0];
		int age= Integer.parseInt(args[1]);
		if(str1.equalsIgnoreCase(f))
		{
			if(age>=1&& age <=58)
				System.out.println("The percentage of interest is :8.2%");
			if(age>=59&& age<=100)
				System.out.println("The percentage of interest is :9.2%");
		}
		if(str1.equalsIgnoreCase(m))
		{
			if(age>=1&& age<=58)
				System.out.println("The percentage of interest is :8.4%");
			if(age>=59&& age<=100)
				System.out.println("The percentage of interest is :10.5%");
		}
	}
}
