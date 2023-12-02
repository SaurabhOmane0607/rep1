package simpleAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations 
{
	 static WebDriver driver;
	
	@Test
	public void s1() 
	{
		System.out.println("This is the core code");
		
	}

	
	@BeforeClass
	public void s2() throws InterruptedException
	{
		driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
	}
	
	@AfterClass
	
	public void s3() throws InterruptedException 
	{
		driver.getTitle();
		
		Thread.sleep(2000);
		
		driver.getCurrentUrl();
		
		driver.close();
	}
}
