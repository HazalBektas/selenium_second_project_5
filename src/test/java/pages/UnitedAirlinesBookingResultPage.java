package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UnitedAirlinesBookingResultPage extends UnitedAirlinesBasePage{
    public UnitedAirlinesBookingResultPage(){
        super();
    }
    @FindBy(css= "div[class$='sticky--1-Jdl'] span b" )
    public WebElement departureDateConfirmation;

}
