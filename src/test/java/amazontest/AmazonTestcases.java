package amazontest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basefunctions.BaseClass;

public class AmazonTestcases extends BaseClass {
public WebDriver driver;

@BeforeMethod
public void browser() {
	driver=initializedriver();
}

@Test
public void tc01() throws InterruptedException {
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
	System.out.println("getAttribute() method:" + searchbox.getAttribute("name"));
	searchbox.sendKeys("iphone");
	driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).submit();
	/*List<WebElement> productnames=driver.findElements(By.xpath("//div[@class='sg-col-inner']//span[@class='a-size-medium a-color-base a-text-normal']"));
	System.out.println("getText() method:");
	for(int i=0;i<=productnames.size();i++) {
	System.out.println(productnames.get(i).getText());	
	}
	*/
	driver.navigate().to("https://www.redbus.in/");
	driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("Kottayam");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']//li")).click();
	driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("Bangalore");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']//li[text()='Madiwala, Bangalore']")).click();
	driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
	driver.findElement(By.xpath("//td[@class='current day']")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("search_btn")).click();
	/*driver.navigate().to("https://www.makemytrip.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[2]")).click();
	driver.findElement(By.id("twotabsearchtextbox")).clear();
	driver.navigate().to("https://www.flipkart.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.quit();
	driver.close();*/
	
}

}
