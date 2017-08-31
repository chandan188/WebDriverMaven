package testnglearrning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {

	@Test(groups="med")
	public void validateTitlesTest() {

		String expected_title = "yahoo.com";
		String actual_title = "gmail.com";

		/*if (expected_title.equals(actual_title)) {

			System.out.println("Test case pass");
		} else {

			System.out.println("Test case fail");
		}*/
		
		
		//Assert.assertEquals(expected_title, actual_title);
		//Assert.assertTrue(false,"Element not found on the page");
		Assert.fail("Login not successful");

	}

}
