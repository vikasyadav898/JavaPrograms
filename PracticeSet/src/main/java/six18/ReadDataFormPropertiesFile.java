package six18;

import java.io.FileReader;
import java.util.Properties;

public class ReadDataFormPropertiesFile {

	  
	public static void main(String[] args)throws Exception{  
	    FileReader reader=new FileReader("C:\\Users\\DELL\\eclipse-workspace\\PracticeSet\\src\\main\\java\\six18\\db.properties");  
	      
	    Properties p=new Properties();  
	    p.load(reader);  
	      
	    System.out.println(p.getProperty("user"));  
	    System.out.println(p.getProperty("password"));  
	}  
}


