package EXO3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertEquals;

public class EXO3 {
    static WebDriver driver;

    @BeforeClass
    public static void setUpBeforeClass(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void test(){
        driver.get("https://www.ebay.com");
        //Search shoes for men

        ShoesMen search = new ShoesMen(driver);
         /* search.enterValues("shoes for men");
        search.formSubmit();*/
       search.clickcategorie();
        search.clickShoes();
        search.clickMen();


        //Choose product from list
        Choice product = new Choice(driver);
        product.click(0);

        //select products caracteristique
        Caracteristic a = new Caracteristic(driver);
        //a.selectcolor(8);
        a.selectSize(2);
        a.selectQuantity("1");
        a.addToCart(); //Clic on Add to cart

        //show panier
        Price prix = new Price(driver);

        //compare total price of panier with price wanted
        assertEquals(prix.priceTotal(),"US $12.59");
    }

    @AfterClass
    public static void setUpAfterClass() throws Exception {
       driver.quit();


    }


}
