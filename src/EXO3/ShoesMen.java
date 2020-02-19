package EXO3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoesMen extends PageException {
     /*@FindBy(id="gh-ac") private WebElement search;

    public ShoesMen(WebDriver driver) {
        super(driver);
    }

    public void enterValues(String value){
        this.search.sendKeys(value);
    }
    public void formSubmit(){
        search.submit();
    }*/

    @FindBy(id="gh-shop-a") private WebElement categorie;
    @FindBy(css="#gh-sbc > tbody > tr > td:nth-child(1) > ul:nth-child(6) > li:nth-child(4) > a") private WebElement shoes;

    @FindBy(css="#w2-w0 > ul > li:nth-child(1) > a") private WebElement Manshoes;
    public ShoesMen(WebDriver driver) {
        super(driver);
    }

    public void clickcategorie(){
        categorie.click();
    }

    public void  clickShoes(){
        shoes.click();
    }

    public void clickMen(){
        Manshoes.click();
    }


}
