package HelpMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import javax.swing.plaf.PanelUI;

public class AlertMethods {

    public WebDriver driver;

    public AlertMethods (WebDriver driver)
    {
        this.driver = driver;
        }

        public void  AcceptAlert () {

            Alert AlertOk = driver.switchTo().alert();
            AlertOk.accept();
        }

        public void DismissAlert() {
            Alert AlertDismiss = driver.switchTo().alert();
            AlertDismiss.dismiss();
        }

        public void AcceptFillAlert (String input) {
            Alert AlertPromt = driver.switchTo().alert();
            AlertPromt.sendKeys (input);
            AlertPromt.accept();

        }
}
