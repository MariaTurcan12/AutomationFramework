package HelpMethods;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PageMethods {

    public WebDriver driver;

    public PageMethods (WebDriver driver) {
        this.driver=driver;
    }

    public void navigateToUrl(String URL){
        driver.navigate().to(URL);
    }

    public void validateTitlePage (String expected) {

        String actual = driver.getTitle();

        Assert.assertEquals(expected,actual);
    }
}
