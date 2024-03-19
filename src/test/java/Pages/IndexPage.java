package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BasePage {

    public IndexPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "btn1")
    private WebElement SignInElement;

    @FindBy(id = "btn2")
    private WebElement skipSignIn;

    public void ClickSignIn () {
        elementMethods.ClickElements(SignInElement);
    }
    public void SkipSignIn () {elementMethods.ClickElements(skipSignIn);}


}
