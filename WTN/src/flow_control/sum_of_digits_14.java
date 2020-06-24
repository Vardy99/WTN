package flow_control;

public class sum_of_digits_14 {
	public static void main(String[] args) {
		int n=1234;
		int i,sum=0,m;
		while(n>0)
		{
			m=n%10;
			sum=sum+m;
			n=n/10;
		}
		System.out.println(sum);
	}

}

