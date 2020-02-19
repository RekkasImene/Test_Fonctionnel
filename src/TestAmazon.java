
import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestAmazon {

	static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
        //For Firefox 
        //System.setProperty("webdriver.gecko.driver","/opt/webdriver/geckodriver");
		// For Chrome
        System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	

	@Test

	public void test() {
		
	    driver.get("https://www.amazon.com");
	    WebElement inputSearch = driver.findElement(By.id("twotabsearchtextbox"));
	    inputSearch.sendKeys("google pixel 3");
	    inputSearch.submit();
	    List<WebElement> myElement =  (new WebDriverWait(driver, 10)).
	    until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".a-link-normal.a-text-normal")));
	    
	}
	

	
	@AfterClass
	public static void setUpAfterClass() throws Exception {
		driver.quit();
	   
		
	}


}
