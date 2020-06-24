package arrays;
import java.util.Arrays;
public class sort_array_6 {

	public static void main(String args[])
	{
		int a[]= {5,4,8,6,4,7,8,9,0,5,10};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			if(i!=a.length)
			System.out.print(" ");
		}
		
	}
	
}