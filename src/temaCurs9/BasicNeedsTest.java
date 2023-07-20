package temaCurs9;

public class BasicNeedsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Primate dataType instance of Human");
		System.out.println("---------------------------------");
		Human om = new Human();
		om.walk("can walk");
		om.run("can run");
		om.eat("Omnivore");
		om.speak("Can speak");
		om.sleep("I need to sleep!");		
		
		System.out.println("---------------------------------");
		
		System.out.println("Primate dataType instance of Monkey");
		System.out.println("---------------------------------");
		Monkey maimuta = new Monkey();
		maimuta.walk("can walk");
		maimuta.run("can run");
		maimuta.eat("Mostly erbivore");
		maimuta.speak("Cannot speak");
		maimuta.sleep("I need to sleep!");
	}

}
