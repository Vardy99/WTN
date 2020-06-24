package flow_control;

import java.util.Scanner;

public class prime_or_not_12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		boolean f=false;
		n=sc.nextInt();
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0) {
				f=true;
				break;
			}
		}
		if(f==false)
		{
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}

}
