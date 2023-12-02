package simpleAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Annotations2 

{
	@Test
	public void s1() throws InterruptedException
	{
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://www.flipkart.com/");
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
