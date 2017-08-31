package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSliders {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));
		
		WebElement mainSlider = driver.findElement(By.xpath("//*[@id='slider']"));
		int width = mainSlider.getSize().width/2;
		System.out.println(mainSlider.getLocation());
		/*mainSlider.getLocation().*/
		
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, width, 0).perform();
		

	}

}
