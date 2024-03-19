package Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public WebDriver driver;

    @Before
    public void Setup(){

        // Setam driverul pentru browser

        System.setProperty("webdriver.chrome.driver", "C:/Users/marturcan/Downloads/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");

        // Facem o instanta de Chrome

        driver = new ChromeDriver();

        // accesam un anumit URL

        driver.get("https://demo.automationtesting.in/Index.html");

        // facem instanta maximized

        driver.manage().window().maximize();
    }

    @After
    public void clearenvironment (){

        //driver.quit();
    }


}
