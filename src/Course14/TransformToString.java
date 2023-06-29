package Course14;

public class TransformToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = 'a';
		String chString = Character.toString(ch);  //folosim clasa parinte a data type ului pe care vreau sa il transform in string
		String chString2 = String.valueOf(ch);		//am transformat caracterul in string
		
		int nr = 20;
		String intString = Integer.toString(nr);
		String intString2 = String.valueOf(nr);
		
		boolean bol = true;
		String bolString = Boolean.toString(bol);
		String bolString2 = String.valueOf(bol);		
		
		String str = null;		
	//	System.out.println(str.toString());		//daca obiectul este null, arunca null pointer
		System.out.println(String.valueOf(str));			//daca obiectul este null, printeaza null
		
	}
	
	

}
