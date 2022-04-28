package basefunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public WebDriver driver;

public WebDriver initializedriver() {
	
	//Used to configure browser driver path
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//main//resources//drivers//chromedriver.exe");
	//Create an instance of Chrome Driver123
	driver=new ChromeDriver();
	
	return driver;
}
}
