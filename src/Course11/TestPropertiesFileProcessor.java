package Course11;

public class TestPropertiesFileProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PropertiesFileProcessor obj = new PropertiesFileProcessor();
		obj.writePropertiesFile();
		
		obj.readPropertiesFile("User");
		obj.readPropertiesFile("pass");
		obj.readPropertiesFile("email");
	}

}
