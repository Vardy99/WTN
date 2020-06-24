package arrays;

public class arrange_num_10 {

	public static void main(String args[])
	{
		int a[]= {2, 2, 2},b[]= new int[a.length];
		int i=0,j=0,n=a.length;
		for(i=0;i<n;i++)
			if(a[i]%2==0)
				{b[j]=a[i];
				  j++;
				}
		for(i=0;i<n;i++)
			if(a[i]%2!=0)
				{
				b[j]=a[i];
				j++;
				}
		for(i=0;i<n;i++)
			System.out.print(b[i]+" ");
	}
	
	
}