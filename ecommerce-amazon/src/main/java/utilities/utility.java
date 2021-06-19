package utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utility {
	
	public static void takeScreenshot(WebDriver driver,int testID) throws IOException
	{
	//Screenshot 
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest = new File ("test-output"+File.separator+"testScreenshots"+File.separator+"Test_"+testID+"Date and Time"+".jpg");
	
	
    org.openqa.selenium.io.FileHandler.copy(source, dest);
	}
	
	

}
