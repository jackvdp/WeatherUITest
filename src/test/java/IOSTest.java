import constants.TestGroups;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.testapp.home.HomePage;

public class IOSTest extends BaseTest {

    @Test(groups = {TestGroups.IOS})
    public void testLocationButtonTriggersNavigation() {
        
        HomePage homePage = new HomePage(this.driver);
        
        homePage.clickButton("LocationButton");
        homePage.waitForElementToBePresent("segmentPicker");
        WebElement picker = homePage.findElement("segmentPicker");
        
        homePage.waitForElementToBePresent("erjnkgrntkjgnrjkg");

        Assert.assertNotNull(picker);

    }

    @Test(groups = {TestGroups.IOS})
    public void getVideo() {
        HomePage homePage = new HomePage(this.driver);

        homePage.swipeLeft();
        homePage.waitForElementToBePresent("Video");
        WebElement video = homePage.findElement("Video");
        
        Assert.assertNotNull(video);
    }

    @Test(groups = {TestGroups.IOS})
    public void customLocationTest() {
        HomePage homePage = new HomePage(this.driver);

        homePage.swipeLeft();
        homePage.waitForElementToBePresent("Video");
        homePage.swipeLeft();
        homePage.waitForElementToBePresent("addLocationButton");
        WebElement locationTextField = homePage.findElement("locationTextField");
        homePage.typeIntoTextField(locationTextField, "Swansea");
        homePage.clickButton("addLocationButton");
        homePage.waitForElementToBePresent("CustomLocation_Swansea");
        homePage.swipeLeft();
        homePage.waitForElementToBePresent("weatherView_Swansea");
    }

    @Test(groups = {TestGroups.IOS})
    public void toggleBetweenDailyAndHourlyTest() {
        HomePage homePage = new HomePage(this.driver);

        homePage.clickButton("LocationButton");
        homePage.waitForElementToBePresent("weatherView_London");

        homePage.clickButton("segmentPicker_Hourly");
        homePage.waitForElementToBePresent("hourlyWeather");
    }

}

