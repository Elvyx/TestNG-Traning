package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 


{
	@Test(groups={"Smoke"})
	
	public void payLoan() 
	{
		
		System.out.println("PayLoan");
	}
	
	
	@BeforeTest
	public void prerequisite()
	{
		
		System.out.println("delete data in DB first");
	}
	
}
