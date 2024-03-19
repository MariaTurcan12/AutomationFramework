package Pages;

import HelpMethods.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;
    public ElementMethods elementMethods;
    public PageMethods pageMethods;
    public AlertMethods alertMethods;

    public FrameMethods frameMethods;

    public TabMethods tabMethods;
    public BasePage (WebDriver driver){
        this.driver = driver;
        elementMethods = new ElementMethods(this.driver);
        pageMethods = new PageMethods(this.driver);
        alertMethods = new AlertMethods(this.driver);
        frameMethods = new FrameMethods(this.driver);
        tabMethods = new TabMethods(this.driver);
        PageFactory.initElements(this.driver,this);

    }


}
