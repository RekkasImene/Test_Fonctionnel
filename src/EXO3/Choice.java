package EXO3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Choice extends PageException {
    @FindBy(className="s-item__link") private List<WebElement> product;

    public Choice(WebDriver driver) {
        super(driver);
    }

    public void click(int value){

        product.get(value).click();
    }
}