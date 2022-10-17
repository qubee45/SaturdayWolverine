package upskill.utilities;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenShot {
	
	public void screenshot() throws Exception {
		
		String filename = "Ebay ";
		
		DateFormat dateformat = new SimpleDateFormat("mm-dd-yyyy h-m-s");
		Date date = new Date();
		
	File screenshot = ((TakesScreenshot) SetupDrivers.driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir")+"/screenshots/"+filename+dateformat.format(date)+".png"));
	
	System.out.println(">>>>>>>>>ScreenShot Taken<<<<<<<<<<<<<");
	

}
	
	
}