package core.page;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.List;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Dimension;

public class BasePage {
    protected AppiumDriver driver;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
    }

    public void click(WebElement elem) {
        elem.click();
    }

    public void horizontalSwipeByPercentage (double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * endPercentage);

        new TouchAction(driver)
            .press(point(startPoint, anchor))
            .waitAction(waitOptions(ofMillis(1000)))
            .moveTo(point(endPoint, anchor))
            .release().perform();
    }

    public void swipeLeft() {
        HashMap<String, String> m = new HashMap<String,String>();
        m.put("direction","left");
        driver.executeScript("mobile:swipe", m);
    }
    

    public WebElement getElement(By by) {
        return driver.findElement(by);
        
    }

    public List<WebElement> getElements(By by) {
        return driver.findElements(by);
    }

    public String getText(WebElement elem) {
        return elem.getText();
    }

    public void waitForElementToBeVisible(WebElement elem) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(elem));
    }

    public void waitForElementToBePresent(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 600);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void type(WebElement elem, String text) {
        elem.sendKeys(text);
    }
}
