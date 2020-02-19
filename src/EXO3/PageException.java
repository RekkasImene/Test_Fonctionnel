package EXO3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageException {
    protected WebDriver driver;
    public PageException(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

