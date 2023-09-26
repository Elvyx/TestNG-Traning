package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {
	
	
	
	
	@Test
	
	public void mobileLoginHome()
	{
		System.out.println("mobileLoginHome");
	}

	@BeforeClass
	public void bfClass()
	{
		System.out.println("Execute before the class");
		
	}
	@Test(groups={"Smoke"})
	public void mobileSignupHome()
	{
		System.out.println("mobileSignupHome");
	}
	
	@Test
	public void mobileSignoutHome()
	{
		System.out.println("mobileSignoutHome");
	}
	
	@BeforeSuite
	public void bfsuite()
	
	{
		
		System.out.println("Run before any test case");
	}
	
	
	@AfterClass
	public void afClass()
	{
		
		System.out.println("Execute after any class");
	}
	@Test
	public void APILoginHome()
	{
		System.out.println("APILoginHome");
	}
	
	
}
