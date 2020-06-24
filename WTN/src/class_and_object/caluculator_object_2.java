package class_and_object;
public class caluculator_object_2 {

	public static void main(String args[])
	{
		caluculator_class_2  n1 = new caluculator_class_2();
		int resultint=n1.powerInt(2, 4);
		System.out.println("Integer result is:"+resultint);
		double resultdouble=n1.powerDouble(2.8, 2);
	   System.out.println("Double result is:"+resultdouble);
	}
	
}