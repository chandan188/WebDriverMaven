package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\selenium-prerequisite\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://gmail.com");
		driver.navigate().to("http://gmail.com");
		
		//driver.navigate().back();
		driver.manage().window().maximize();
		
		//driver.manage().window().fullscreen();
		
		//1234
		String actual_title = driver.getTitle(); //website
		
		
		System.out.println(driver.getTitle().length());
		
		
		String expected_title = "Gmail"; //excel
		
		
		
		
		if(actual_title.equals(expected_title)){
			
			System.out.println("Test case pass");
			
		}else{
			
			System.out.println("Test case fail");
			
		}
		
		
		driver.close();
		driver.quit();
		
		
	}

}
