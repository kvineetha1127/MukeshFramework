package utility;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	public static String captureScreenShot(WebDriver driver)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshotpath=System.getProperty("user.dir")+"/Screenshots/FreeCRM_"+getCurrentDateTime()+".png";
		try {
			FileHandler.copy(src, new File(screenshotpath));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to capture the screenshot"+e.getMessage());
		}
		return screenshotpath;
		
	}
	
	public static String getCurrentDateTime()
	{
		DateFormat currentformat=new  SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date date = new Date();
		return currentformat.format(date);
	}

}
