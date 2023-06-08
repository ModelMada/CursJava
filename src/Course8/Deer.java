package Course8;

public class Deer extends WildAnimal{
	
	@Override   //nu are impact asupra codului, suprascrie metoda din parinte
	public void makeSound() {
		System.out.println("Meeeee !");
	}
	
	public void eatGrass() {
		System.out.println("I eat grass and I like it!");
	}

}
