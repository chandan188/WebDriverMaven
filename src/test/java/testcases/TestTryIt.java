package testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestTryIt {

	public static WebDriver driver;
	
	public static void captureScreenshot() throws IOException{
		
		//min+day+hour+sec.jpg
		
		
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("f:\\screenshot\\error.jpg"));
	
	}
	
	public static void main(String[] args) throws IOException {

		driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.switchTo().frame("iframeResult");

		((JavascriptExecutor) driver).executeScript("myFunction()");

		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'",
				driver.findElement(By.xpath(".//*[@id='mySubmit']")));

		captureScreenshot();
	}

}
