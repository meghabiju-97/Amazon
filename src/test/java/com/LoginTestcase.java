package com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestcase {
	
	@Test

	public void tc00001() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazonsite.in/");
		System.out.println("Hello")
		
		driver.findElement(By.cssSelector("input[placeholder='Search Amazon.in']")).sendKeys("iphone");
		
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		
		List<WebElement> ele=driver.findElements(By.xpath("//div[contains(@data-asin,'B0') and @data-index>=3]"));
		
		
		for(WebElement name:ele) {
			System.out.println(name.getText());
		}
	}
	

}
