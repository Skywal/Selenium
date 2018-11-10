import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BotForDictionary {
    private static WebDriver driver;

    public static void main(String[] args){
        try {
            Document doc = Jsoup.connect("https://dictionary.cambridge.org/dictionary/english/ship").get();
            String title = doc.title();
            System.out.println(title);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
