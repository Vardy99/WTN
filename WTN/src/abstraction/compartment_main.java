package abstraction;

import java.lang.Math;
public class compartment_main {

	public static void main(String args[])
	{
	
		int min=1;
		int max=4;
		int random_number;
		compartment c[]=new compartment[10];
		for(int i=0;i<10;i++)
		{
			random_number=(int)(Math.random()*(max+min-1)+min);
			if(random_number==1)
			{
				c[i]=new luggage();
			}
			if(random_number==2)
			{
				c[i]=new ladies();
				
			}
			if(random_number==3)
			{
				c[i]=new first_class();
			}
			if(random_number==4)
			{
				c[i]=new generel();
			}
			//System.out.println(c[i].notice());
		}
	}
	
}