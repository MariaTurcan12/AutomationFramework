package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WindowsPage extends BasePage{
    public WindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = ".nav-stacked>li>a")
    public List<WebElement> WindowList;

    @FindBy (css = "#Tabbed button")
    public WebElement NewTabWindow;

    @FindBy (css = "#Seperate button")
    public WebElement NewSeparateWindows;

    @FindBy (css = "#Multiple button")
    public WebElement MultipleWindows;

    public void Tab(){
        elementMethods.ClickElements(WindowList.get(0));
        elementMethods.ClickElements(NewTabWindow);
        tabMethods.SwitchSpecificTabWindow(1);
        tabMethods.CloseSpecificTabWindow();
        tabMethods.SwitchSpecificTabWindow(0);
    }

    public void Window(){
        elementMethods.ClickElements(WindowList.get(1));
        elementMethods.ClickElements(NewSeparateWindows);
        tabMethods.SwitchSpecificTabWindow(1);
        tabMethods.CloseSpecificTabWindow();
        tabMethods.SwitchSpecificTabWindow(0);
    }

    public void Tabs(){
        elementMethods.ClickElements(WindowList.get(2));
        elementMethods.ClickElements(MultipleWindows);
        tabMethods.SwitchSpecificTabWindow(2);
        tabMethods.CloseSpecificTabWindow();
        tabMethods.SwitchSpecificTabWindow(1);
        tabMethods.CloseSpecificTabWindow();
        tabMethods.SwitchSpecificTabWindow(0);
    }
}
