package simpleAnnotations;

import org.testng.annotations.Test;

public class Annotations3 
{
	@Test(enabled = false)
	public void S1()
	{
		System.out.println("I am S1");
	}
	
	@Test (dependsOnMethods = "S4")
	public void S2()
	{
		System.out.println("I am S2");
		
	}

	@Test
	public void S3()
	{
		System.out.println("I am S3");
	}
	
	@Test
	public void S4()
	{
		System.out.println("I am S4");
	}


}
