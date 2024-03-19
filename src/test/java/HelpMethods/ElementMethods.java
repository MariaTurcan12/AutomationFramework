package HelpMethods;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementMethods {

    public WebDriver driver;

    public ElementMethods(WebDriver driver){

        this.driver = driver;
    }

    public void ClickElements (WebElement Element) {
        Element.click();
    }

    public void HoverElement (WebElement Element){
        Actions action = new Actions(driver);
        action.moveToElement(Element).perform();

    }

    public void fillElement (WebElement element, String value) {

        element.sendKeys(value);
    }

    public void validateElementMessage (WebElement element,String message) {
        String actual = element.getText();

        Assert.assertEquals(actual,message);
    }

    public void selectElementByText (WebElement element, String value) {

        Select skillsSelect = new Select(element);
        skillsSelect.selectByVisibleText(value);

    }

    public void selectElementByValue (WebElement element, String value) {

        Select skillsSelect = new Select(element);
        skillsSelect.selectByValue(value);

    }

}
