package Course11;

public class Tester<T> {				//definim obiectul generic direct din semnatura; in interiorul clasei vreau sa folosesc obiect generic
	
	//obiect generic
	T object;
	
	public Tester(T obj) {
		this.object=obj;
	}

	public static void main(String[] args) {
		
		Tester t1 = new Tester("text");
		Tester t2 = new Tester(123);
		
	}
}
