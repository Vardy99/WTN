package arrays;
import java.util.Scanner;
public class max_and_min_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int min,max;
		max=a[0];
		min=a[0];
		for(i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
	}
}
