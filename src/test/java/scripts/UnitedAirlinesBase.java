package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.UnitedAirlinesBasePage;
import pages.UnitedAirlinesBookingResultPage;
import utilities.ConfigReader;
import utilities.Driver;

public class UnitedAirlinesBase {
WebDriver driver;
SoftAssert softAssert;
UnitedAirlinesBasePage unitedAirlinesBasePage;
UnitedAirlinesBookingResultPage unitedAirlinesBookingResultPage;


@BeforeMethod
    public void setup(){

    driver = Driver.getDriver();
    driver.get(ConfigReader.getProperty("appURL"));

    softAssert = new SoftAssert();
    unitedAirlinesBasePage= new UnitedAirlinesBasePage();
    unitedAirlinesBookingResultPage= new UnitedAirlinesBookingResultPage();




}

@AfterMethod
    public void teardown(){

    softAssert.assertAll();
    Driver.quitDriver();
}




}
