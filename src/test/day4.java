package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day4 {
	
	@Test
	
	public void webLoginCar()
	{
		System.out.println("webLoginCar");
	}

	
	@AfterMethod
	public void afMethod()
	
	{
		
		System.out.println("Execute after each method");
	}
	
	@Test(groups={"Smoke"})
	public void mobileLoginCar()
	{
		System.out.println("mobileLoginCar");
		
	}
	
	@BeforeMethod
	public void bfmethod()
	
	{
		
		System.out.println("Run before any method");
	}
	
	@Test
	public void APILoginCar()
	{
		System.out.println("APILoginCar");
	}
}
