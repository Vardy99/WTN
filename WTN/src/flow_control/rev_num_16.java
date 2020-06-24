package flow_control;
import java.util.Scanner;
public class rev_num_16 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n,m,rev=0;
			n=sc.nextInt();
			while(n!=0)
			{
				m=n%10;
				rev=rev*10+m;
				n=n/10;
			}
			System.out.println(+rev);
		}

	}

