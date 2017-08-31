package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAuthAlert {

	public static void main(String[] args) {

		//qa.way2automation.com

		WebDriver driver = new FirefoxDriver();
		driver.get("http://nearlythere:nearlythere@getproactiv-ca.stg01.grdev.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}

}
