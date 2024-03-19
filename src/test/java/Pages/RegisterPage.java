package Pages;

import HelpMethods.ElementMethods;
import HelpMethods.FrameMethods;
import HelpMethods.PageMethods;
import Objects.RegisterObject;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Year;
import java.util.List;

public class RegisterPage extends BasePage{

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()=\"SwitchTo\"]")
    private WebElement SwitchToDropdown;

    @FindBy(xpath = "//a[text()=\"Alerts\"]")
    private WebElement AlertsOption;

    @FindBy (xpath = "//a[text()=\"Frames\"]")
    private WebElement FramesDropdown;

    @FindBy (xpath = "//a[text()=\"Windows\"]")
    private WebElement WindowsOption;

    @FindBy (css = "input[ng-model='FirstName']")
    private WebElement FirstNameInput;

    @FindBy (css = "input[ng-model='LastName']")
    private WebElement LastNameInput;

    @FindBy (css = "textarea[ng-model='Adress']")
    private WebElement Address;

    @FindBy (css = "input[ng-model='EmailAdress']")
    private WebElement EmailInput;

    @FindBy (css = "input[ng-model='Phone']")
    private WebElement PhoneInput;

    @FindBy (css = "input[value=\"FeMale\"]")
    private WebElement Gender;

    @FindBy (id = "checkbox1")
    private WebElement Hobbies;

    @FindBy (id = "msdd")
    private WebElement languageDropdown;

    @FindBy (css = ".ui-front>li>a")
    private List<WebElement> languagesOptions;

    @FindBy (id = "Skills")
    private WebElement skillsDropdown;

    @FindBy (css = ".select2-selection")
    private WebElement SelectCountry;

    @FindBy (className = "select2-search__field")
    private WebElement SelectCountryInput;

    @FindBy (id = "yearbox")
    private WebElement yearDropdown;

    @FindBy (css = "select[placeholder=\"Month\"")
    private WebElement monthDropdown;

    @FindBy (id = "daybox")
    private WebElement dayDropdown;

    @FindBy (css = "input[ng-model=\"Password\"]")
    private WebElement PasswordInput;

    @FindBy (css = "input[ng-model=\"CPassword\"]")
    private WebElement ConfirmPasswordInput;

    @FindBy (id = "submitbtn")
    private WebElement Submitbutton;

    public void navigateToAlertPage () {
        elementMethods.HoverElement(SwitchToDropdown);
        elementMethods.ClickElements(AlertsOption);
        pageMethods.navigateToUrl("https://demo.automationtesting.in/Alerts.html");
    }

    public void navigateToFramesPage () {
        elementMethods.HoverElement(SwitchToDropdown);
        elementMethods.ClickElements(FramesDropdown);
        pageMethods.navigateToUrl("https://demo.automationtesting.in/Frames.html");
    }

    public void navigateToWindowsPage () {
        elementMethods.HoverElement(SwitchToDropdown);
        elementMethods.ClickElements(WindowsOption);
        pageMethods.navigateToUrl("https://demo.automationtesting.in/Windows.html");
    }

    public void RegisterProcess(RegisterObject registerObject){
        elementMethods.fillElement(FirstNameInput, registerObject.getFirstNameValue());
        elementMethods.fillElement(LastNameInput, registerObject.getLastNameValue());
        elementMethods.fillElement(Address, registerObject.getAddressValue());
        elementMethods.fillElement(EmailInput, registerObject.getEmailValue());
        elementMethods.fillElement(PhoneInput, registerObject.getPhoneNrValue());
        elementMethods.ClickElements(Gender);
        elementMethods.ClickElements(Hobbies);
        elementMethods.selectElementByValue(yearDropdown, registerObject.getYearValue());
        elementMethods.selectElementByText(monthDropdown, registerObject.getMonthValue());
        elementMethods.selectElementByText(dayDropdown, registerObject.getDayValue());
        LanguagesProcess(registerObject.getLanguagesValues());
        CountryProcess(registerObject.getCountryValue());
        elementMethods.selectElementByValue(skillsDropdown, "Java");
        elementMethods.fillElement(PasswordInput, registerObject.getPasswordValue());
        elementMethods.fillElement(ConfirmPasswordInput, registerObject.getConfirmPasswordValue());
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Submitbutton);
        elementMethods.ClickElements(Submitbutton);
    }

    public void LanguagesProcess(String languages){
        elementMethods.ClickElements(languageDropdown);
        for(int index=0; index<languagesOptions.size(); index++){
            if (languagesOptions.get(index).getText().equals(languages)) {
                languagesOptions.get(index).click();
            }
        }
        elementMethods.ClickElements(FirstNameInput);
    }

    public void CountryProcess(String country){
        elementMethods.ClickElements(SelectCountry);
        elementMethods.fillElement(SelectCountryInput, country);
        SelectCountryInput.sendKeys(Keys.ENTER);
    }

}

