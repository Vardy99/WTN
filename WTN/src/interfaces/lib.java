package interfaces;
public class lib {
public static void main(String args[]) {
	kid_user k1=new kid_user();
    k1.setAge(10);
    k1.setBookType("kids");
    k1.registerAccount();
    k1.requestBook();
    adult_user a1=new adult_user();
    a1.setAge(17);
    a1.setBookType("fiction");
    a1.registerAccount();
    a1.requestBook();

}
}