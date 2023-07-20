package temaCurs9;

public class Human extends Primate implements BasicNeeds{
	
	@Override
	public String eat(String hrana) {
		System.out.println(hrana);
		return hrana;
	};
	@Override
	public void sleep(String somn) {
		System.out.println(somn);
	};
	@Override
	public void drink(String drink) {
		System.out.println(drink);
	};

}
