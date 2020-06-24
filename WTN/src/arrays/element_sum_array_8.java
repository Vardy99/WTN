package arrays;

public class element_sum_array_8 {

	public static void main(String args[])
	{
		int a[]= {1,6,4,7,9};
		int n=a.length;
		int in6=0,in7 = 0,sum=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==6)
				in6=i;
			if(a[i]==7)
				in7=i;
		}
		if((in6 < in7))
		{
			for(int i=0;i<n;i++)
			{
				if(!(i>=in6&&i<=in7))
				sum=sum+a[i];
			}
		}
		else
		{
			for(int i=0;i<n;i++)
				sum=sum+a[i];
		}
		System.out.println(sum);
	}
	
}