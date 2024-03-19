package Tests;

import Base.BaseTest;
import Base.Hooks;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import Objects.LogInObject;
import Pages.IndexPage;
import Pages.SignInPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest extends Hooks {

    @Test

    public void LoginMethod (){

        LogInObject logInObject = new LogInObject(TestData);


        IndexPage indexPage = new IndexPage(driver);

        indexPage.ClickSignIn();

        SignInPage signInPage = new SignInPage(driver);

        signInPage.loginInvalid(logInObject);


    }
}
