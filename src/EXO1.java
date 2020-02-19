import static org.junit.Assert.*;

        import java.util.List;
import java.util.concurrent.TimeUnit;

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

public class EXO1 {
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

        driver.get("https://www.ebay.com");
        WebElement shop = driver.findElement(By.id("gh-shop-a"));
        shop.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement Kids_toys = driver.findElement(By.linkText("Kids toys"));
        Kids_toys.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement Actions = driver.findElement(By.linkText("Action"));
        Actions.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement cars = driver.findElement(By.linkText("Car"));
        cars.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement Casts = driver.findElement(By.linkText("Cast Iron"));
        Casts.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> list= driver.findElements(By.className("s-item__image-wrapper"));
        assertEquals(6,list.size());

    }



    @AfterClass
    public static void setUpAfterClass() throws Exception {
        driver.quit();


    }
}
