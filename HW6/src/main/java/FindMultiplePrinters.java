import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


import java.util.concurrent.TimeUnit;

public class FindMultiplePrinters {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\LanitProject\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        driver.get("https://www.avito.ru/");


        AvitoPageObject page = PageFactory.initElements(driver, AvitoPageObject.class);

        page.category();
        page.wantedCategory();
        page.search();
        page.city();
        page.wantedCity();
        page.button();
        actions.moveToElement(page.checkBox);
        page.checkBox();
        page.filter();
        page.resultList();
    }
}