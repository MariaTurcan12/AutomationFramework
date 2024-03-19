package Tests;

import Base.BaseTest;
import Base.Hooks;
import HelpMethods.AlertMethods;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import HelpMethods.TabMethods;
import Objects.AlertObject;
import Pages.AlertPage;
import Pages.IndexPage;
import Pages.RegisterPage;
import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class AlertTest extends Hooks {

    @Test
    public void HeadersMethod() {

        AlertObject alertObject = new AlertObject(TestData);


        IndexPage indexPage = new IndexPage(driver);
        indexPage.SkipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);
        AlertPage alertPage = new AlertPage(driver);

        registerPage.navigateToAlertPage();
        alertPage.AlertOk();
        alertPage.AlertOkCancel();
        alertPage.AlertOkSendKeys(alertObject);



    }

}
