package Curs9;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop laptop = new Laptop(123,19,5);
		System.out.println(laptop.calculatePrice());
		laptop.productRating();
		
		System.out.println("------------------");
		
		MobilePhone mobile = new MobilePhone(100, 19);
		System.out.println(mobile.calculatePrice()); //nu are return type, trebuie printat cu sysout
		mobile.productRating();//cum metoda nu este abstracta, o putem apela direct fara instanta
	}

}
