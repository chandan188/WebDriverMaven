package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestFindingElements {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://gmail.com");
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(time, unit)
	/*	Options opt = driver.manage();
		Window win = opt.window();
		win.maximize();*/
		
		
		System.out.println(driver.getTitle().length());
		
	/*	String title = driver.getTitle();
		System.out.println(title);
		System.out.println(title.length());*/
		
		driver.manage().window().maximize();
		
	//	driver.manage()
		
		
	/*	WebElement username = driver.findElement(By.id("Email"));
		username.sendKeys("trainer@way2automation.com");
		
		//tagName[@attribute='value']
		WebElement nextBtn = driver.findElement(By.xpath("//input[@id='next']"));
		nextBtn.click();*/
		
		//NoSuchElementException
		//ElementNotVisibleException
		//Firebug and Firepath
		driver.findElement(By.id("Email")).sendKeys("trainer2734234@way2automation.com");
		//tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@id='next']")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		/*
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""))).click();
		*/
		
		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='errormsg_0_Email']"))).getText());
		
		
		
		//System.out.println(driver.findElement(By.xpath("//*[@id='errormsg_0_Email']")).getText());
		
		
		
		
		
	/*	
		driver.findElement(By.name("Passwd")).sendKeys("skdfjsdf");
		
		
		driver.findElement(By.id("signIn")).click();
		
		System.out.println(driver.findElement(By.id("errormsg_0_Passwd")).getText());
*/		
		
	}

}
