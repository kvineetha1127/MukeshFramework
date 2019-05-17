package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider 
{
	Properties prop;
	public ConfigDataProvider()
	{
		File src = new File("./Config/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} 
		catch (Exception e) {

			System.out.println("Unable to load the config file"+e.getMessage());
		}
	}
	
	public String getConfigData(String keySearch)
	{
		return prop.getProperty(keySearch);
	}
	
	public String getBrowser()
	{
		 return prop.getProperty("Browser");
	}
	
	public String getURL()
	{
		return prop.getProperty("qaURL");
	}
}
