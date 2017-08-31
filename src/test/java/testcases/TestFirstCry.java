package testcases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class TestFirstCry {

	public static void main(String[] args) {

		ProfilesIni listProfile = new ProfilesIni();
		FirefoxProfile profile = listProfile.getProfile("default");

		WebDriver driver = new FirefoxDriver(profile);
		driver.get("http://www.firstcry.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	
		
		driver.findElement(By.xpath("html/body/div[5]/div[1]/div/div[2]/span[5]")).click();

		// without id of the frame
		driver.switchTo().frame("iframe_Login");

		driver.findElement(By.xpath("//*[@id='txtLUNm']")).sendKeys("trainer@way2automation.com");

		driver.switchTo().defaultContent();

		// frame count - ids

		List<WebElement> frames = driver.findElements(By.tagName("iframe"));

		System.out.println(frames.size());

		for (WebElement frame : frames) {

			System.out.println(frame.getAttribute("id"));
		}

	}

}
