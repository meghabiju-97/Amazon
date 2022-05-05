package amazontest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.JCommander.Builder;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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
	
	driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.name("cusid")).sendKeys("53920");
	driver.findElement(By.name("submit")).click();
	driver.switchTo().alert().accept();
	//Thread.sleep(4000);
	driver.navigate().refresh();
	//driver.switchTo().alert().dismiss();
	
	
	
	 /*driver .navigate().to("http://automationpractice.com/index.php?id_category=3&controller=category");
	 Thread.sleep(2000);
	 WebElement testDropDown=driver.findElement(By.id("selectProductSort"));
	 Select dropdown=new Select(testDropDown);
	 dropdown.selectByValue("name:desc");
	 dropdown.selectByVisibleText("In stock");
	 JavascriptExecutor jse=(JavascriptExecutor)driver;//driver is eligible to execute java script
	 jse.executeScript("window.scrollBy(0,250)");
	 WebElement productname=driver.findElement(By.xpath("//img[@class='replace-2x img-responsive' and @title='Faded Short Sleeve T-shirts']"));
	 Actions action=new Actions(driver);
	 action.moveToElement(productname).perform();
	// action.dragAndDrop(testDropDown, productname)
	 
	 
	 ////img[@class='replace-2x img-responsive' and @title='Faded Short Sleeve T-shirts']
	 
	/*List<WebElement> productnames=driver.findElements(By.xpath("//div[@class='sg-col-inner']//span[@class='a-size-medium a-color-base a-text-normal']"));
	System.out.println("getText() method:");
	for(int i=0;i<=productnames.size();i++) {
	System.out.println(productnames.get(i).getText());	
	}
	
	/*driver.navigate().to("https://www.redbus.in/");
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
