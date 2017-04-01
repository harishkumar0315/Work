package groupsTest;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

				
	@BeforeMethod
	public void UseridGeneration()
	{
		System.out.println("This block executes before each Test");
	}
	
	@BeforeTest
	public void Cookies()
	{
		System.out.println("This block executes Before all  Testcases");
		//delete cookies
	}
	
	@AfterTest
	public void Cookiesclose()
	{
		System.out.println("This block executes after all  Testcases");
		//close the browsers
	}
	
	@AfterMethod
	public void Reportadding()
	{
		System.out.println("This block executes after each Test");
	}
	
	@Test (groups = ("Priority1"))
	public void OpeningBrowser()
	{
		//This opens the Browser
		System.out.println("Executing Test 1");
	}
	
	//Groups will help to run the multiple testcases in different classes with same priority value
	
	@Test (groups = ("Priority3"))
	public void Login()
	{
		System.out.println("Executing Test 2");
	}
	
	@Test (groups = ("Priority2"))
	public void FlightBooking()
	{
		System.out.println("Executing Test 3");
	}
	
	
	
	
}
