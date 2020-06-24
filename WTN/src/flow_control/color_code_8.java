package flow_control;
import java.util.Scanner;
public class color_code_8 {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		
		switch(ch) {
		case 'r': System.out.println("Red");
				  break;
		case 'g': System.out.println("Green");
		  		  break;
		case 'b': System.out.println("Blue");
		          break;
		case 'y': System.out.println("Yellow");
		    	  break;
		case 'o': System.out.println("Orange");
		  	 	  break;
		default : System.out.println("Invalid code");
				    
		}
		
	}

}
