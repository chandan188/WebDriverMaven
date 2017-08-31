package testcases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestTabsandPopups {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://hdfcbank.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("-----Printing ids from first window-----");
		Set<String> winids = driver.getWindowHandles();
		Iterator<String> itrate = winids.iterator();

		String first_window = itrate.next(); // first window id
		System.out.println(first_window);

		List<WebElement> frames = driver.findElements(By.tagName("iframe"));

		System.out.println(frames.size());

		for (WebElement frame : frames) {

			System.out.println(frame.getAttribute("id"));
		}

		driver.switchTo().frame("http-push");

		driver.findElement(By.id("closeImage")).click();

		driver.switchTo().window(first_window);

		driver.findElement(By.xpath("//*[@id='loginsubmit']")).click();

		System.out.println("-----Printing ids from second window-----");

		winids = driver.getWindowHandles(); // 2 window ids
		itrate = winids.iterator();

		System.out.println(itrate.next()); // 1st window
		String second_window = itrate.next(); // 2nd window
		System.out.println(second_window);

		driver.switchTo().window(second_window);

		driver.findElement(By.xpath("html/body/div[4]/div[3]/div/div/div[1]/div/a")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/p[3]/a")).click();

		System.out.println("-----Printing ids from third window-----");

		winids = driver.getWindowHandles(); // 2 window ids
		itrate = winids.iterator();

		System.out.println(itrate.next());
		System.out.println(itrate.next());
		String third_window = itrate.next(); //3rd window
		System.out.println(third_window);
		
		driver.switchTo().window(third_window);
		System.out.println(driver.getTitle().contains("JetPrivilege HDFC Bank World Chip"));
	
		/*driver.close();
		driver.switchTo().window(second_window);
		driver.close();
		driver.switchTo().window(first_window);
		driver.close();*/
		
		driver.quit();
	
	}

}
