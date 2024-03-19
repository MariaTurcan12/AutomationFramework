package Pages;

import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import Objects.LogInObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[placeholder='E mail']")
    public WebElement emailElement;

    @FindBy(xpath = "//input[@placeholder=\"Password\"]")
    public WebElement passwordElement;

    @FindBy(id = "enterbtn")
    public WebElement enterbtn;

    @FindBy(id = "errormsg")
    public WebElement errorMessage;


    public void loginInvalid (LogInObject logInObject) {

        pageMethods.validateTitlePage(logInObject.getSignInTitle());
        elementMethods.fillElement(emailElement, logInObject.getEmail());
        elementMethods.fillElement(passwordElement, logInObject.getPassword());
        elementMethods.ClickElements(enterbtn);
        elementMethods.validateElementMessage(errorMessage, logInObject.getMessage());
    }

}
