
import com.google.common.annotations.VisibleForTesting;
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

import java.util.List;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;


public class EXO2
{
    static WebDriver driver;

    @BeforeClass
    public static void setUpBeforeClass(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void test(){
        driver.get("https://www.ebay.com");
        /*WebElement search = driver.findElement(By.id("gh-ac"));
        search.sendKeys("Shoes for men");
        search.submit();*/
        WebElement shop = driver.findElement(By.id("gh-shop-a"));
        shop.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement shoes = driver.findElement(By.linkText("Shoes"));
        shoes.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement men = driver.findElement(By.linkText("Men's Shoes"));
        men.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        List<WebElement> list= driver.findElements(By.className("s-item__link"));
        list.get(0).click();
        //(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.id("msku-sel-1")));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Select size = new Select(driver.findElement(By.id("msku-sel-1")));
        size.selectByValue("2");
        //(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.id("isCartBtn_btn")));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

      /*  Select color = new Select(driver.findElement(By.id("msku-sel-2")));
        color.selectByValue("8");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);*/
        WebElement card = driver.findElement(By.id("isCartBtn_btn"));
        card.click();

       // (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".val-col.total-row")));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement price = driver.findElement(By.cssSelector(".val-col.total-row"));

        assertEquals("US $12.59",price.getText());

    }

    @AfterClass
    public static void setUpAfterClass() throws Exception {
       driver.quit();


    }


}


