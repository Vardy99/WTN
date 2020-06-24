package flow_control;
import java.util.Scanner;
public class lower_to_upper_7 {
	public static void main(String[] args) {
		int i,len;
        char ch;
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        len=str.length();
        for(i=0;i<len;i++)
        {
            ch=str.charAt(i);
            if(Character.isUpperCase(ch))
                System.out.print(Character.toLowerCase(ch));
            else
                System.out.print(Character.toUpperCase(ch));
        }
	}
}
