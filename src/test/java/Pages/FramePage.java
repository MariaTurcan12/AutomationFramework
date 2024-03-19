package Pages;

import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import Objects.FrameObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage extends BasePage{


    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[type=\"text\"]")
    private WebElement SingleFrame;

    @FindBy (css = "a[href=\"#Multiple\"]")
    private WebElement MultipleFrame;

    public void singleFrame (FrameObject frameObject){
        frameMethods.SwitchToFrame("singleframe");
        elementMethods.fillElement(SingleFrame,frameObject.getSingleFrame());
        frameMethods.SwitchToBaseFrame();

    }

    public void multipleFrame (FrameObject frameObject){
        elementMethods.ClickElements(MultipleFrame);
        frameMethods.SwitchToFrame(driver.findElement(By.cssSelector("iframe[src=\"MultipleFrames.html\"]")));
        frameMethods.SwitchToFrame(driver.findElement(By.cssSelector("iframe[src=\"SingleFrame.html\"]")));
        elementMethods.fillElement(SingleFrame, frameObject.MultipleFrame);

    }
}
