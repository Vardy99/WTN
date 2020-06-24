package arrays;

public class checking_sequence_11 {
	public static void main(String args[])
	{
		int a[]= {1,4,1,4};
		int n=a.length;
        int count=0;
		for(int i=0;i<n;i++)
		{
		 if(a[i]==1||a[i]==4)
			 count++;
		}
		if(count==n)
			System.out.print("->true");
		else
			System.out.print("->false");
	}
	
}