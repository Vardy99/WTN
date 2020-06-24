package class_and_object;
public class box_class_1 {

     int width;
     int height;
	 int depth;
	public box_class_1(int width,int height,int depth){
		this.width=width;
		this.height=height;
		this.depth=depth;		
	}
	public int volume(){
		int volume=height*depth*width;
		return volume;
	}
	
}