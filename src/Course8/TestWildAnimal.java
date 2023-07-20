package Course8;

public class TestWildAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WildAnimal animal = new WildAnimal();
		animal.makeSound();
		
		System.out.println("--------------");
		
		Deer bambi = new Deer();
		bambi.makeSound();   //metoda suprascrisa/override
		bambi.eatGrass();
		
		System.out.println("---------------");
		
		//WildAnimal bambi2 = new Deer(); //data type pt bambi2 este wildAnimal, dar constructorul apelat este cel din deer/ instanta este deer
		//WebDriver browser = new ChromeDriver();
		
		Lion simba = new Lion();
		simba.makeSound();//metoda suprascrisa
		simba.eatMeat();

		System.out.println("---------------");
	
		WildAnimal simba2 = new Lion();
		simba2.makeSound();
		simba.eatMeat(); //metoda nu se regaseste in wildAnimal
		((Lion) simba).eatMeat();//folosim cast pt a utiliza metoda din lion desi obiectul este de tip wild animal
		
		//simba = new Deer();
		//simba.makeSound();
		
		
	}

}
