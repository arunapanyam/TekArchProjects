package Testfiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample2 {
	WebDriver driver;
	 @Test
	  public void test(){
	    System.out.println("Test Print");
	    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    
	    driver.navigate().to("https://www.google.com/");
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  }


}
