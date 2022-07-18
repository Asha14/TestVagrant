package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readConfig {
	
	   Properties prop;

	   public readConfig() {
	   File src = new File("./Configuration_Files/config.properties");
	       try {
	       FileInputStream fis = new FileInputStream(src);
	   prop = new Properties();
	           prop.load(fis);
	       } catch (Exception e) {
	           System.out.println(e);
	       }

	   }


	  

	   public String request_details()
	   {
	       String requestpath = prop.getProperty("getrequest");
	       return requestpath;
	   }





	public String getURL() {
		// TODO Auto-generated method stub
		String url = prop.getProperty("baseURL");
		   return url;
	}
}