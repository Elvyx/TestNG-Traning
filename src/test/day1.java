package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void closeBrowser()
	
	{
		
		System.out.println("Quit the web broswer");
	}
	
	
	@Test()
	public void Demo() 
	
	{
		System.out.println("Hello World");
		
	}

	
	@Test
	public void Demo2() 
	
	{
		System.out.println("Bye");
	}
	
	@AfterSuite
	public void afsuite()
	
	{
		
		System.out.println("Execute me last after every test cases");
	}
}
