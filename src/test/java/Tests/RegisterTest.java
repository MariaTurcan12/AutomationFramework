package Tests;

import Base.BaseTest;
import Base.Hooks;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import Objects.RegisterObject;
import Pages.IndexPage;
import Pages.RegisterPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegisterTest extends Hooks {

    @Test

    public void RegisterMethod () {
        RegisterObject registerObject = new RegisterObject(TestData);

        IndexPage indexPage = new IndexPage(driver);
        indexPage.SkipSignIn();

        RegisterPage registerPage = new RegisterPage (driver);
        registerPage.RegisterProcess(registerObject);


    }
}
