package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testUtils.Intialize;


public class Login extends Intialize{



	@Test(priority=1)
	public void segmentLogin() throws InterruptedException
	{
		new Intialize().launch();
		driver.get("https://www.tutorialspoint.com");
		Thread.sleep(7000);

	}
	@Test(priority=2)
	public void newlogin() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("user_email")).sendKeys("sudharsan7795@gmail.com");

	}





}
