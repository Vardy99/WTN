package flow_control;

import java.util.Scanner;

public class num_bw_range_11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int f,n1,n2;
		n1=sc.nextInt();
		n2=sc.nextInt();
		for(f=n1;f<=n2;f++)
		{
			if(f%2==0) {
			System.out.println(+f);
		     }
		}
	}

}
