package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestGmail {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		driver.findElement(By.id("Email")).sendKeys("trainer@way2automation.com");
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.withMessage("User defined message for time out after 30 sec")
				.ignoring(NoSuchElementException.class);
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("next1"))).click();

	}

}
