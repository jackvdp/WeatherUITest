package pages.testapp.home;

import core.page.BasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    
    public HomePage(AppiumDriver driver) {
        super(driver);
    }

    public void typeIntoTextField(WebElement element, String text) {
        type(element, text);
    }

    public void clickButton(String id) {
        WebElement testElement = getElement(By.id(id));
        click(testElement);
    }

    public WebElement findElement(String id) {
        return getElement(By.id(id));
    }

    public void waitForElementToBePresent(String id) {
        waitForElementToBePresent(By.id(id));
    }
}

