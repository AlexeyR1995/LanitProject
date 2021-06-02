import io.cucumber.java.*;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Пусть;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class StepDef {

    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\LanitProject\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 5);
        actions = new Actions(driver);
    }

    @After
    public void close() {
        driver.quit();
    }

    @ParameterType(".*")
    public Categories категория(String категория){
        return Categories.valueOf(категория);
    }

    @ParameterType(".*")
    public Sort sortValue(String sortValue){
        return Sort.valueOf(sortValue);
    }

    @Пусть("открыт ресурс авито")
    public void открытРесурсАвито() {
        driver.get("https://www.avito.ru/");
    }

    @И("в выпадающем списке категорий выбрана {категория}")
    public void вВыпадающемСпискеКатегорийВыбранаОргтехника(Categories категория) {
        WebElement selectMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@data-marker='search-form/category']")));
        Select selection = new Select(selectMenu);
        selection.selectByVisibleText(категория.type);
    }

    @И("в поле поиска введено значение {word}") //принтер
    public void вПолеПоискаВведеноЗначениеПринтер(String значение) {
        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='suggest-root-1v2AH js-suggest suggest_search']")));
        actions.moveToElement(search).click().sendKeys(значение).build().perform();
    }

    @Тогда("кликнуть по выпадающему списку региона")
    public void кликнутьПоВыпадающемуСпискуРегиона() {
        WebElement townMenu = driver.findElement(By.xpath(("//div[@class='main-select-2pf7p main-location-3j9by']")));
        townMenu.click();
    }

    @Тогда("в поле регион введено значение {word}")
    public void вПолеРегионВведеноЗначениеВладивосток(String город) {
        WebElement townInput = driver.findElement(By.xpath("//input[@placeholder='Город, регион или Россия']"));
        townInput.sendKeys(город);
        WebElement town = driver.findElement(By.xpath("//ul[@class='suggest-suggests-bMAdj']/li[1]"));
        try {
            wait.until(ExpectedConditions.textToBePresentInElement(town, город));
            actions.moveToElement(town).click().build().perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @И("нажата кнопка показать объявления")
    public void нажатаКнопкаПоказатьОбъявления() {
        WebElement button = driver.findElement(By.cssSelector(("button[class='button-button-2Fo5k button-size-m-7jtw4 button-primary-1RhOG']")));
        button.click();
    }

    @Тогда("открылась страница результаты по запросу {word}")
    public void открыласьСтраницаРезультатыПоЗапросуПринтер(String значение) {
        String text = driver.findElement(By.cssSelector(".page-title-text-WxwN3")).getText();
        Assert.assertTrue(text.contains(значение));
    }

    @И("активирован чекбокс только с фотографией")
    public void активированЧекбоксТолькоСФотографией() {
        WebElement checkBox = driver.findElement(By.xpath("//input[@name='withImagesOnly']"));
        if (!checkBox.isSelected()) {
            actions.moveToElement(checkBox);
            checkBox.click();
        }
    }

    @И("в выпадающем списке сортировка выбрано значение {sortValue}")
    public void вВыпадающемСпискеСортировкаВыбраноЗначениеДороже(Sort sortValue) {
        WebElement priceFilter = driver.findElement(By.cssSelector(".sort-select-3QxXG > .select-select-3CHiM"));
        priceFilter.findElement(By.xpath("//option[. = '" + sortValue.type + "']")).click();
    }

    @И("в консоль введено значение названия и цены {int} первых товаров")
    public void вКонсольВведеноЗначениеНазванияИЦеныПервыхТоваров(int количество) {
        List<WebElement> webElements = driver.findElements(By.xpath("//div[@data-marker='item']//div[@class='iva-item-content-m2FiN']"));
        for (int i = 0; i < количество; i++) {
            System.out.println("Printer name = " +
                    webElements.get(i).findElement(By.xpath(".//div[@class='iva-item-titleStep-2bjuh']/a")).getText()
                    + "\nPrinter price = " + webElements.get(i).findElement(By.xpath(".//span[@class='price-price-32bra']//meta[@itemprop='price']")).getAttribute("content"));
        }
    }
}