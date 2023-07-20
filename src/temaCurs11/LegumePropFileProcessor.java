package temaCurs11;
import java.io.FileInputStream;
import java.util.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class LegumePropFileProcessor {

	public void writeVegetablePropFile() {
		
		try(FileOutputStream outPutStream = new FileOutputStream("legume.properties")) {
			
			Properties propVegFile = new Properties();
			propVegFile.put("Carrot", "50");
			propVegFile.put("Lettuce", "30");
			propVegFile.put("Celery", "60");
			propVegFile.put("Cucumbers", "30");
			
			propVegFile.store(outPutStream, "Am salvat fisierul!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public String readCalories(String key) throws IOException {
		
		FileInputStream inputStream = new FileInputStream("legume.properties");
		Properties propFile = new Properties();
		propFile.load(inputStream);
		System.out.println(propFile.getProperty(key));

		return propFile.getProperty(key);
}

}
