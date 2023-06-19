package Course11;

import java.io.FileNotFoundException;
import java.io.*;
import java.util.Properties;

public class PropertiesFileProcessor {
	
	
	public void writePropertiesFile() {
		
		try(FileOutputStream outPutStream = new FileOutputStream("test.properties")) {	//canalul
			
			//java inchide direct canalul de comunicatie daca pun intre parantezele try (); nu mai sunt nevoit sa inchid de mana cu comanda de jos;
			//outPutStream.close();
			
			Properties propFile = new Properties();	//obiectul
			propFile.setProperty("User", "admin123");
			propFile.setProperty("pass", "admin123");
			propFile.setProperty("email", "admi@admin.com");
			
			propFile.store(outPutStream, "am salvat fisierul");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void readPropertiesFile(String key) {
		
		try (FileInputStream inputStream = new FileInputStream("test.properties")){
			
			Properties propFile = new Properties();
			propFile.load(inputStream);
			System.out.println(propFile.getProperty(key));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	

}
