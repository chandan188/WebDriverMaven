package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestIsElementPresent {
	
	public static WebDriver driver;
	
	public static boolean isElementPresent(String locator){
		
		/*try{
		driver.findElement(By.id(locator));
		return true;
		}catch(Throwable t){
			
			return false;
		}*/
		
		int size = driver.findElements(By.id(locator)).size();
		
		if(size==0){
			
			return false;
		}else{
			
			return true;
		}
		
	}

	public static void main(String[] args) {


		driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	

		System.out.println(isElementPresent("next"));
		
		/*System.out.println(driver.findElement(By.id("next1")).isDisplayed());
		
		*/
	}

}
