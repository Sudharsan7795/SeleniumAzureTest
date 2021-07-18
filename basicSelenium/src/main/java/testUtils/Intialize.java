package testUtils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Intialize {
	
	public static WebDriver driver;

	public void launch() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkspace\\basicSelenium\\chromedriver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
		String destination = null;
		try
		{
			String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			//after execution, you could see a folder "FailedTestsScreenshots" under src folder
			destination = "D:\\EclipseWorkspace\\basicSelenium\\Screenshot"+screenshotName+dateName+".png";
			File finalDestination = new File(destination);
			FileUtils.copyFile(source, finalDestination);
		}
		catch(Exception e)
		{

		}
		return destination;

	}
	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
}
