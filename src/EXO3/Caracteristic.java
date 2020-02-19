package EXO3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Caracteristic extends PageException {
    @FindBy(id="msku-sel-1") private WebElement size;
   // @FindBy(id="msku-sel-2") private WebElement color;
    @FindBy(id="qtyTextBox") private WebElement quantity;
    @FindBy(id="isCartBtn_btn") private WebElement add;

    public Caracteristic(WebDriver driver) {
        super(driver);
    }

    public  void selectSize(int i) {
        Select select = new Select(size);
        select.selectByIndex(i);
    }
    /*public  void selectcolor(int i) {
        Select drop = new Select(color);
        drop.selectByIndex(i);
    }*/
    public  void selectQuantity(String value) {
        quantity.sendKeys(Keys.chord(Keys.CONTROL, "a"), value);

    }

    public void addToCart(){
        add.click();
    };
}
