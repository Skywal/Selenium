import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SimpleTest {
    @Test
    public void navigateToRozetkaWebSiteAndSearchForIPhone(){
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver023\\geckodriver.exe");

        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://rozetka.com.ua/ua/");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

        WebElement searchField = driver.findElement(By.cssSelector(".rz-header-search-input-text"));
        searchField.clear();
        searchField.sendKeys("iPhone 6");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

        WebElement searchButton = driver.findElement(By.cssSelector(".js-rz-search-button"));
        searchButton.click();
    }
}
