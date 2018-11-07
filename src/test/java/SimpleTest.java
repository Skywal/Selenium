import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class SimpleTest {
    @Test
    public void navigateToRozetkaWebSiteAndSearchForIPhone(){
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver023\\geckodriver.exe");

        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);

        WebDriver driver = new FirefoxDriver();
        
        driver.manage().window().maximize();
        driver.navigate().to("https://rozetka.com.ua/ua/");
    }
}
