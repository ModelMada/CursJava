package Course8;

public class AgeVerifier {

	public void checkAge(int age) throws InvalidAgeExpection{
		if(age<18) {
			throw new InvalidAgeException("De ce nu esti major?");
		}else {
			System.out.println("You are allowed to proceed!");
		}
	}
}
