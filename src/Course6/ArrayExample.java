package Course6;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] textArray = new String[4];
		//String[] textArray = {null,null,null,null}
		//index					0		1	2	3
		
		System.out.println(textArray[0]);
		
		textArray[1]= "Oana";
		System.out.println(textArray[1]);
		
		//String[] textArray = {null,null,null,null}
		//index					0	  Oana	2	3
		
		textArray[3]= "Ioana";
		System.out.println(textArray[3]);
		
		//String[] textArray = {null,null,null,null}
		//index					0	  Oana	2	Ioana
		
		System.out.println("---------FOR--------");
		
		for (int i =0; i<textArray.length;i++) {
			System.out.println(textArray[i]);
		}
		System.out.println("--------FOR EACH---------");
		for (String element : textArray) {
			System.out.println(element);
		}
	}

}
