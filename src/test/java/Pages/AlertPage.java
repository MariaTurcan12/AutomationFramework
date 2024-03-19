package Pages;

import HelpMethods.AlertMethods;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import Objects.AlertObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AlertPage extends  BasePage {


    @FindBy(css = ".nav-stacked>li>a")
    private List<WebElement> AlertMenu;

    @FindBy(css = ".btn.btn-danger")
    private WebElement AlertPageOkPop;

    @FindBy(css = ".btn.btn-primary")
    private WebElement AlertCancel;

    @FindBy(css = ".btn.btn-info")
    private WebElement AlertTextBox;

    public AlertPage(WebDriver driver) {
        super(driver);
    }


    public void AlertOk (){
        elementMethods.ClickElements(AlertMenu.get(0));
        elementMethods.ClickElements(AlertPageOkPop);
        alertMethods.AcceptAlert();
    }

    public void AlertOkCancel (){
        elementMethods.ClickElements(AlertMenu.get(1));
        elementMethods.ClickElements(AlertCancel);
        alertMethods.DismissAlert();
    }

    public void AlertOkSendKeys (AlertObject alertObject){
        elementMethods.ClickElements(AlertMenu.get(2));
        elementMethods.ClickElements(AlertTextBox);
        alertMethods.AcceptFillAlert(alertObject.getAlertValue());
    }


}
