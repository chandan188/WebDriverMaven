package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDown {

	public static void main(String[] args) {


		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//driver.findElement(By.xpath("//*[@id='searchLanguage']")).sendKeys("Dansk");
	
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='searchLanguage']"));
		
		Select select = new Select(dropdown);
		//select.selectByVisibleText("Dansk");
		select.selectByValue("hi");
		
	/*	System.out.println(select.getOptions().size());*/
		
		// 0 - length-1, list - size-1
		
		List<WebElement> values = dropdown.findElements(By.tagName("option"));
		
		System.out.println("Total values are : "+values.size());
		
		//values[7]

		System.out.println(values.get(7).getAttribute("lang"));
		
		
		for(int i=0;i<values.size();i++){
			
			
			System.out.println(values.get(i).getAttribute("lang"));
			
		}
		
		System.out.println("----Printing links from the page------");
				
		
		WebElement section = driver.findElement(By.xpath(".//*[@id='www-wikipedia-org']/div[6]/div[3]"));
	
		
		
		List<WebElement> links = section.findElements(By.tagName("a"));
		
		System.out.println("Total links are : "+links.size());
		
		for(WebElement link:links){
			
			System.out.println(link.getText()+"-----URL IS: "+link.getAttribute("href"));
		}
		
		
		//driver.findElements(By.xpath(".//input[contains(@id,'mai')]")).get(1).sendKeys("");
		//driver.findElements(By.id("textbox")).get(2).click();
		/*
		 * id=textbox
		 * id=textbox
		 * id=textbox
		 * id=textbox
		 * 
		 * 
		 * 
		 */
		
		WebElement block = driver.findElement(By.xpath("html/body/form"));
		block.findElements(By.tagName("input")).get(1).click();
		/*
		WebElement block = driver.findElement(By.xpath("html/body/form"));
		
		block.findElements(By.tagName("input")).get(1).click();
	*/
		
		
		
		

	}

}
