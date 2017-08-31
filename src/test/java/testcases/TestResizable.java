package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestResizable {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		WebElement resizable = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(resizable, 400, 400).perform();
		
		
	
		
		
	}

}
