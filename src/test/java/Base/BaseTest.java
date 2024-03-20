package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    public WebDriver driver;


    public void Setup(){


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headLess");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--window-size=1920,1080");
        chromeOptions.addArguments("--no-sandbox");
        WebDriverManager.chromedriver().setup();


        driver = new ChromeDriver(chromeOptions);
        // accesam un anumit URL
        driver.get("https://demo.automationtesting.in/Index.html");
        // facem instanta maximized
        driver.manage().window().maximize();
    }


    public void clearenvironment (){

        //driver.quit();
    }


}
