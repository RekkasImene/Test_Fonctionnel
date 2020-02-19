package EXO3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Price extends PageException {
    @FindBy(css="#mainContent > div > div.right-section > div > table > tr:nth-child(4) > td.val-col.total-row") private WebElement total;

    public Price(WebDriver driver) {
        super(driver);
    }



    public String priceTotal(){
        return total.getText();
    }
}

