package Course4;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 checkPalindrom("radar");
	}

	public static void checkPalindrom(String cuvant) {
		
		/*
		 * cuvant = radar
		 * cuvant intors = " "
		 * 
		 * cuvant intors = cuvantIntors + "r" ...
		 * 
		 */
		
		String cuvantIntors = "";
		
		for (int i = cuvant.length()-1 ; i>=0 ;i--) {
			cuvantIntors = cuvantIntors + cuvant.charAt(i);
		}
		
		String result = cuvantIntors.equals(cuvant)? "Este palindrom": "nu este palindrom";
		System.out.println(result);
		
	}
}
