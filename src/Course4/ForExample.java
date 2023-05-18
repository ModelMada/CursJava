package Course4;

public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<10;i++) {
			if(i==5) {
				// break;				//intrerupe executia buclei
				continue;   			//face skip la 5, la rularea acestei conditii. te intoarce inapoi in bucla
				}
			System.out.println(i);
		}
	}

}
