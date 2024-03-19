package Tests;

import Base.BaseTest;
import Base.Hooks;
import HelpMethods.ElementMethods;
import HelpMethods.FrameMethods;
import HelpMethods.PageMethods;
import Objects.FrameObject;
import Pages.FramePage;
import Pages.IndexPage;
import Pages.RegisterPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FrameTest extends Hooks {

    @Test
    public void FrameMethod() {

        FrameObject frameObject = new FrameObject(TestData);
        IndexPage indexPage = new IndexPage(driver);
        indexPage.SkipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.navigateToFramesPage();

        FramePage framePage = new FramePage(driver);

        framePage.singleFrame(frameObject);
        framePage.multipleFrame(frameObject);

    }
}
