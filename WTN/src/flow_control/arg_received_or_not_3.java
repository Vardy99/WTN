package flow_control;

public class arg_received_or_not_3 {
	public static void main(String args[])
	{
		if(args.length > 0)
		{
			int count=0;
			for (String val:args) 
				count=count+1;
			for (String val:args) 
			{  System.out.print(val);
			    if(val!=args[count-1])
				  System.out.print(",");
			}
		}
		else
			System.out.println("No values");
			
	}
}
