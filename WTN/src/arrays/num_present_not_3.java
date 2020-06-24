package arrays;
import java.util.Scanner;
public class num_present_not_3 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]= {1,4,34,56,7,89,90,100};
		int i,index=-2;
		Integer search_element=sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(search_element==a[i])
			{
				index=i;
			}
		}
		if(index==-2)
			index=-1;
		System.out.println(index);
	}
	
}