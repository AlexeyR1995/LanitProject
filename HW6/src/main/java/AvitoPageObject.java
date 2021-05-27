import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class AvitoPageObject {

    @FindBy(css = "#category")
    WebElement category;

    @FindBy(css = "#category > option:nth-child(38)")
    WebElement wantedCategory;

    @FindBy(xpath = "//input[contains(@data-marker, 'search-form/suggest')]")
    WebElement search;

    @FindBy(xpath = "//div[contains(@class, 'main-select-2pf7p main-location-3j9by')]")
    WebElement city;

    @FindBy(xpath = "//input[contains(@class, 'suggest-input-3p8yi')]")
    WebElement wantedCity;


    @FindBy(xpath = "//button[contains(@data-marker, 'save-button')]")
    WebElement button;

    @FindBy(xpath = "//div/label[contains(@data-marker, 'delivery-filter')]")
    WebElement checkBox;

    @FindBy(xpath = "//label/input[contains(@data-marker, 'delivery-filter')]")
    WebElement checkBox2;

    @FindBy(xpath = "//div/select/option[3][contains(@value, '2')][contains(@data-marker, 'option(2)')]")
    WebElement filter;

    @FindBy(xpath = "//h3[contains(@itemprop, 'name')]")
    List<WebElement> printers;

    @FindBy(xpath = "//span[contains(@class,'price-price')]")
    List<WebElement> prices;

    public void category() {
        category.click();
    }

    public void wantedCategory() {
        wantedCategory.click();
    }

    public void search() {

        search.click();
        search.sendKeys("принтер");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        search.sendKeys(Keys.ENTER);
    }

    public void city() {
        city.click();
    }

    public void wantedCity() {
        wantedCity.sendKeys("Владивосток");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wantedCity.sendKeys(Keys.ENTER);
    }


    public void button() {
        button.click();
    }

    public void checkBox() {
        if (!checkBox.getAttribute("class").contains("checkbox-checked")) {
            checkBox.click();
        }
    }

    public void filter() {
        filter.click();
    }

    public void resultList() {
        for (int i = 0; i < 3; i++) {
            System.out.println(printers.get(i).getText() + " ");
            System.out.println(prices.get(i).getText());
        }
    }


}
