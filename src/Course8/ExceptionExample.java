package Course8;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] week = {"L","M","Mi","J","V","S","D"};
		
		try {
			System.out.println(week[8]);
			
		}catch(ArrayIndexOutOfBoundsException obj) {
			System.out.println(obj.getMessage());
			
		}
		
		
		
		for(String day :week) {
			System.out.println(day);
		}
	}

}
