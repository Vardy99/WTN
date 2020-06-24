package class_and_object;
public class box_object_1 {

	public static void main(String args[]) {
	
	box_class_1 b1= new box_class_1(1,2,3);
	int v=b1.volume();
	System.out.println("volume of box is:"+v);
}
}