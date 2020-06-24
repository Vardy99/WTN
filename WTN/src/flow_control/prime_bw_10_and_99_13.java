package flow_control;

public class prime_bw_10_and_99_13 {

		public static void main(String args[])
		{
			int i;
			for(i=10;i<=99;i++)
			{
				int count=0;
				for(int j=1;j<=i/2;j++)
				{
					if(i %j ==0)
						count=count+1;
				}
				if(count==1)
					System.out.printf("The number %d is a Prime Number\n",i);
			}
		}
	}

