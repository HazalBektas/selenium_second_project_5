package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.Waiter;

import java.util.List;

public class UnitedAirlinesBasePage {

    public UnitedAirlinesBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css= "a[id^='headerNav']")
    public List <WebElement> mainMenuOptions;

    @FindBy(css = "ul[class$='travelNav--3RNBj'] li" )
    public List<WebElement> travelMenuNavigationItems;

    @FindBy(id= "roundtrip")
    public WebElement roundTripradiButton;

    @FindBy(id ="oneway")
    public WebElement oneWayRadioButton;

    @FindBy(css = "#roundtrip")
    public WebElement roundtripRadioButtonInputBox;

    @FindBy(css = "label[for='roundtrip']")
    public WebElement roundtripRadioButtonLabel;

    @FindBy(css = "#oneway")
    public WebElement onewayRadioButtonInputBox;

    @FindBy(css = "label[for='oneway']")
    public WebElement onewayRadioButtonLabel;

    @FindBy(css = "div[class*='checkboxWrapper']>input")
    public List<WebElement> checkboxInput;


    @FindBy(css = "div[class*='checkboxWrapper']>label")
    public List<WebElement> checkboxLabels;


    @FindBy(id = "bookFlightOriginInput")
    public WebElement fromOriginInputBox;

    @FindBy(id = "bookFlightDestinationInput")
    public WebElement toDestinationInputBox;

    @FindBy(id = "DepartDate")
    public WebElement departDateInputBox;

    @FindBy(css = "#passengerSelector>button")
    public WebElement passengerSelectorButton;

    @FindBy(css = "button[aria-label='Substract one Adult']")
    public WebElement addAdultPlusSignButton;

    @FindBy(id = "cabinType")
    public WebElement cabinTypeDropdownMenu;

    @FindBy(css = "li[id^='cabinType_item-2']")
    public WebElement cabinTypeItems;

    @FindBy(css = "button[aria-label='Find flights']")
    public WebElement findFlightsButton;











}
