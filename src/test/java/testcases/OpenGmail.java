package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGmail {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");		
		System.out.println(driver.getTitle());	
		WebElement email = driver.findElement(By.xpath("//*[@id='lst-ib']"));
		email.sendKeys("facebook");
		WebElement Search = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]"));
		Search.click();
		driver.findElement(By.linkText("Facebook - Log In or Sign Up")).click();
		//WebElement link = driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/h3/a)"));
		//link.click();
		
		
		driver.close();
		
		


	}

}