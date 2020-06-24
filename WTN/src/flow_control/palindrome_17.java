package flow_control;
import java.util.Scanner;

public class palindrome_17 {

		public static void main(String[] args) {
			int n,m,p=0,temp;
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			temp=n;
			while(n>0)
			{
				m=n%10;
				p=(p*10)+m;
				n=n/10;
			}
			if(temp==p)
			{
				System.out.println("Palindrome");
			}
			else {
				System.out.println("Not palindrome");
			}
		}

	}

