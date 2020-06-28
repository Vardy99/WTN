package inheritance;

class animal {
	
	void eat() {
		System.out.println("Eating");
	}
	
	void sleep() {
		System.out.println("Sleeping");
	}
}

class bird extends animal{
	void fly() {
		System.out.println("Flying");
	}
}

public class animal_bird_1 {

	public static void main(String[] args) {
			
		animal a=new animal();
		a.eat();
		a.sleep();
		
		bird b=new bird();
		b.eat();
		b.sleep();
		b.fly();
	}

}
