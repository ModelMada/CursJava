package Course8;

public class ExceptionExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String nume = "Ion";
			System.out.println(nume.length());
			
		}catch(Exception e) {
			System.out.println("Exception occured!");
			System.out.println(3/0);
		}finally {
			System.out.println("Finally block of code");
		} //indiferent ce se intampla in try catch, finally se executa - il folosim cand vrem neaparat sa executam ceva indiferent de rezultatul try catch

		System.out.println("Seteaza parametrul inapoi");
}
}
