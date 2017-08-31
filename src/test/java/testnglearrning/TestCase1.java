package testnglearrning;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest
	public void createDbConn(){
		
		System.out.println("Creating the DB Conn");
		
	}
	
	@AfterTest
	public void closeDBConn(){
		
		System.out.println("Closing the DB Conn");
	}
	
	@BeforeMethod
	public void launchBrowser(){
		
		System.out.println("Launching the browser");
		
	}
	
	@AfterMethod
	public void closeBrowser(){
		
		System.out.println("Closing the browser");
	}
	
	@Test(priority=1,groups="high")
	public void doUserReg(){
		
		
		System.out.println("Executing User Reg test");
		
		
	}
	
	@Test(priority=2,groups="high")
	public void doLogin(){
		
	
		System.out.println("Executing login test");
		
		
	}
	
	
	
	
	

}
