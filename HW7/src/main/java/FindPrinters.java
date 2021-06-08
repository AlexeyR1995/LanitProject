import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindPrinters {
    private WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, 10);


    public FindPrinters(WebDriver driver) {
        this.driver = driver;
    }


    @Step
    public void openMainPage() {
        driver.get("https://www.avito.ru/");
    }

    @Step
    public WebElement category() {
        WebElement category = driver.findElement(By.cssSelector("#category"));
        category.click();
        return category;
    }

    @Step
    public WebElement search() {
        WebElement search = driver.findElement(By.cssSelector("#category > option:nth-child(38)"));
        search.click();
        return search;
    }

    @Step
    public WebElement printer() {
        WebElement printer = driver.findElement(By.xpath("//input[contains(@data-marker, 'search-form/suggest')]"));
        printer.sendKeys("Принтер");
        wait.until(ExpectedConditions.elementToBeClickable(printer));
        printer.sendKeys(Keys.ENTER);
        return printer;
    }

    @Step
    public WebElement city() {
        driver.findElement(By.xpath("//div[contains(@class, 'main-select-2pf7p main-location-3j9by')]")).click();
        WebElement wantedCity = driver.findElement(By.xpath("//input[contains(@class, 'suggest-input-3p8yi')]"));
        wantedCity.sendKeys("Владивосток");
        wait.until(ExpectedConditions.elementToBeClickable(wantedCity));
        wantedCity.sendKeys(Keys.ENTER);
        return wantedCity;
    }

    @Step
    public WebElement button() {
        WebElement button = driver.findElement(By.xpath("//button[contains(@data-marker, 'popup-location/save-button')]"));
        button.click();
        return button;
    }

    @Step
    public WebElement checkBox() {
        WebElement checkBox = driver.findElement(By.xpath("//div/label[contains(@data-marker, 'delivery-filter')]"));
        if (!checkBox.getAttribute("class").contains("checkbox-checked")) {
            checkBox.click();
        }
        return checkBox;
    }

    @Step
    public WebElement filter() {
        WebElement filter = driver.findElement(By.xpath("//div/select/option[3][contains(@value, '2')][contains(@data-marker, 'option(2)')]"));
        filter.click();
        return filter;
    }

    @Step
    public void printerAndPriceList() {
        List<WebElement> printers = driver.findElements(By.xpath("//h3[contains(@itemprop, 'name')]"));
        List<WebElement> prices = driver.findElements(By.xpath("//span[contains(@class,'price-price')]"));
        for (int i = 0; i < 3; i++) {
            System.out.println(printers.get(i).getText() + " , ");
            System.out.println("Цена - " + prices.get(i).getText());
        }
    }

    @Attachment
    @Step("Make screen shot of results page")
    public byte[] makeScreenShot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Attachment
    @Step("Make screen shot of element on the page")
    public byte[] makeAshotScreenShot(WebElement element) {

        Screenshot screenshot = new AShot()
                .shootingStrategy(ShootingStrategies.viewportPasting(100))
                .takeScreenshot(driver, element);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try {
            ImageIO.write(screenshot.getImage(), "PNG", buffer);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return buffer.toByteArray();
    }

    public void quit() {
        driver.quit();
    }
}
