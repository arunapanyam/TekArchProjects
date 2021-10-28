package Testfiles;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample {
	WebDriver driver;
	 @Test
	  public void test(){
	    System.out.println("Test Print");
	    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    
	    driver.navigate().to("https://www.salesforce.com/");
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  }

}
