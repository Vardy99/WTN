package flow_control;

public class same_as_last_dig_1B{

    static boolean lastDigit(Integer a, Integer b)
	{
		int a_lastDigit=a%10;
		int b_lastDigit=b%10;
		if(a_lastDigit==b_lastDigit)
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Integer a=Integer.parseInt(args[0]);
		Integer b=Integer.parseInt(args[1]);	
		System.out.println("->"+lastDigit(a,b));
		
	}
	
}