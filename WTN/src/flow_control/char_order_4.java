package flow_control;
import java.util.Scanner;
public class char_order_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char s1,s2;
		s1=sc.next().charAt(0);
		s2=sc.next().charAt(0);
		if(s1>s2) {
			System.out.println(s2+","+s1);
		}
		else {
			System.out.println(s1+","+s2);
		}
	}
}
