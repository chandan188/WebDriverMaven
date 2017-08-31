package rough;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestProperties {

	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static MonitoringMail mail = new MonitoringMail();
	
	public static void captureScreenshot() throws IOException {

		// min+day+hour+sec.jpg

		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("f:\\screenshot\\error.jpg"));

	}

	/*
	 * Logging - Apache Log4j - jar, log files, Logger, log4j.properties
	 * 
	 */

	public static void main(String[] args) throws IOException, AddressException, MessagingException {

		try {
			Properties OR = new Properties();
			Properties Config = new Properties();

			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");
			OR.load(fis);
			log.debug("OR Properties file loaded");

			fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
			Config.load(fis);
			log.debug("Config Properties file loaded");
			// driver.findElement(By.xpath(OR.getProperty("username"))).sendKeys("trainer@way2automation.com");
			System.out.println(OR.getProperty("username"));

			// driver.get(Config.getProperty("testsiteurl"))
			System.out.println(Config.getProperty("testsiteurl"));

			if (Config.getProperty("browser").equals("firefox")) {

				driver = new FirefoxDriver();
				log.debug("Firefox Launched");
			} else if (Config.getProperty("browser").equals("chrome")) {

				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
				driver = new ChromeDriver();
				log.debug("Chrome Launched");
			} else if (Config.getProperty("browser").equals("ie")) {

				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}

			driver.get(Config.getProperty("testsiteurl"));
			log.debug("Navigated to : " + Config.getProperty("testsiteurl"));
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(Config.getProperty("implicit.wait")),
					TimeUnit.SECONDS);

			driver.findElement(By.xpath(OR.getProperty("username"))).sendKeys("trainer@way2automation.com");
			driver.findElement(By.id(OR.getProperty("nextBtn"))).click();
			driver.findElement(By.cssSelector(OR.getProperty("password"))).sendKeys("ksdjhfsfsdf");

			driver.quit();
			log.debug("Test Execution completed !!!!");
		} catch (Throwable t) {

			// capture screenshot
			captureScreenshot();
			log.debug(t.getMessage());
			// mail
			mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, t.getMessage(), TestConfig.attachmentPath, TestConfig.attachmentName);
			
		}
	}

}
