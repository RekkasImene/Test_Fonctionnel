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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestWikipedia {
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

        driver.get(" https://www.wikipedia.org/ ");
        WebElement inputSearch = driver.findElement(By.id("searchInput"));
        Select sel=new Select(driver.findElement(By.id("searchLanguage")));
        sel.selectByValue("en");
        inputSearch.sendKeys("Mutation testing");
        inputSearch.submit();
       WebElement myElement =  (new WebDriverWait(driver, 10)).
               until(ExpectedConditions.presenceOfElementLocated(By.id("firstHeading")));
       assertEquals(myElement.getText(),"Mutation testing");

    }



    @AfterClass
    public static void setUpAfterClass() throws Exception {
        driver.quit();


    }
}
