package encapsulation;

public class author_book_details {


	public static void main(String args[])
	{
		author A1=new author();
		A1.setAuthor_name("Sai Vardhan");
		A1.setEmail("saivardhan991@gmail.com");
		A1.setGender('M');
		book B1=new book();
		B1.setBookName("Everything is fine");
		B1.setPrice(589);
		B1.setQtyInStock(100);
		B1.setA(A1);
		System.out.println("Book Name"+B1.getBookName());
		System.out.println("Author name:"+B1.getA().getAuthor_name());
		System.out.println("Email: "+B1.getA().getEmail());
		System.out.println("Gender:"+B1.getA().getGender());
		System.out.println("Price of book:"+B1.getPrice());
		System.out.println("Quantity of stock:"+B1.getQtyInStock());
	}
	
}