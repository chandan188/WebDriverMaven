package testnglearrning;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCase3 {

	
	

	@Test(priority=1,groups="high")
	public void doUserReg(){
		
		Assert.fail("User not registered successfully");
		
		
	}
	
	@Test(priority=2,dependsOnMethods="doUserReg",groups="high")
	public void doLogin(){
		
		System.out.println("Executing login test");
		
		
	}
	@Test(groups="low")
	public void isSkip(){
		
		throw new SkipException("Skipping the test as the condition is not met");
	}
	
}
