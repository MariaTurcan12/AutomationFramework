package Tests;

import Base.BaseTest;
import Base.Hooks;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import HelpMethods.TabMethods;
import Pages.IndexPage;
import Pages.RegisterPage;
import Pages.WindowsPage;
import org.checkerframework.checker.units.qual.N;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class TabTest extends Hooks {

    @Test
    public void TabtestMethod () {

        IndexPage indexPage = new IndexPage(driver);
        indexPage.SkipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.navigateToWindowsPage();

        WindowsPage windowsPage = new WindowsPage(driver);
        windowsPage.Tab();
        windowsPage.Window();
        windowsPage.Tabs();


    }
}
