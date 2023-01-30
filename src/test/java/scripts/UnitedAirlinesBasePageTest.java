package scripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.UnitedAirlinesBasePage;

public class UnitedAirlinesBasePageTest extends UnitedAirlinesBase {

    @BeforeMethod

    public void setPage() {

        unitedAirlinesBasePage = new UnitedAirlinesBasePage();

    }

    @Test(priority = 1, description = "Validate Main menu navigation items")

    public void mainMenuOptions() {

        String[] menuOptions = {"BOOK", "MY TRIPS", "TRAVEL INFO",
                "MILEAGEPLUS® PROGRAM",
                "DEALS",
                "HELP"};
        for (int i = 0; i < (unitedAirlinesBasePage.mainMenuOptions.size()); i++) {

            Assert.assertTrue(unitedAirlinesBasePage.mainMenuOptions.get(i).isDisplayed());
            Assert.assertEquals(unitedAirlinesBasePage.mainMenuOptions.get(i).getText(), menuOptions[i]);

        }

    }

    @Test(priority = 2, description = "Validate Book travel menu navigation items")

    public void bookTravelMenuItems() {

        String[] bookTravelNavigationItems = {"Book",
                "Flight status",
                "Check-in",
                "My trips"};

        for (int i = 0; i < unitedAirlinesBasePage.travelMenuNavigationItems.size(); i++) {
            Assert.assertTrue(unitedAirlinesBasePage.travelMenuNavigationItems.get(i).isDisplayed());

            Assert.assertEquals(unitedAirlinesBasePage.travelMenuNavigationItems.get(i).getText(), bookTravelNavigationItems[i]);

        }


    }

    @Test(priority = 3, description = "Validate Round-trip and One-way radio buttons")
    public void validateRadioButtons() {

        Assert.assertTrue(unitedAirlinesBasePage.roundtripRadioButtonLabel.isDisplayed());
        Assert.assertTrue(unitedAirlinesBasePage.roundtripRadioButtonInputBox.isEnabled());
        Assert.assertTrue(unitedAirlinesBasePage.roundtripRadioButtonInputBox.isSelected());


        Assert.assertTrue(unitedAirlinesBasePage.onewayRadioButtonLabel.isDisplayed());
        Assert.assertTrue(unitedAirlinesBasePage.onewayRadioButtonInputBox.isEnabled());
        Assert.assertFalse(unitedAirlinesBasePage.onewayRadioButtonInputBox.isSelected());


        unitedAirlinesBasePage.onewayRadioButtonLabel.click();


        Assert.assertTrue(unitedAirlinesBasePage.onewayRadioButtonInputBox.isSelected());

        Assert.assertFalse(unitedAirlinesBasePage.onewayRadioButtonLabel.isSelected());


    }

    @Test(priority = 4, description = "Validate Book with miles and Flexible dates checkboxes")

    public void validateMilesAndFlexibleDatesCheckBoxes(){
         Assert.assertTrue(unitedAirlinesBasePage.checkboxLabels.get(0).isDisplayed());
         Assert.assertTrue(unitedAirlinesBasePage.checkboxInput.get(0).isEnabled());
         Assert.assertFalse(unitedAirlinesBasePage.checkboxInput.get(0).isSelected());


         Assert.assertTrue(unitedAirlinesBasePage.checkboxLabels.get(1).isDisplayed());
         Assert.assertTrue(unitedAirlinesBasePage.checkboxInput.get(1).isEnabled());
         Assert.assertFalse(unitedAirlinesBasePage.checkboxInput.get(1).isSelected());



         unitedAirlinesBasePage.checkboxLabels.get(0).click();
         unitedAirlinesBasePage.checkboxLabels.get(1).click();



         Assert.assertTrue(unitedAirlinesBasePage.checkboxInput.get(0).isSelected());
         Assert.assertTrue(unitedAirlinesBasePage.checkboxInput.get(1).isSelected());

         unitedAirlinesBasePage.checkboxLabels.get(0).click();
         unitedAirlinesBasePage.checkboxLabels.get(1).click();


         Assert.assertFalse(unitedAirlinesBasePage.checkboxInput.get(0).isSelected());
         Assert.assertFalse(unitedAirlinesBasePage.checkboxInput.get(1).isSelected());


    }

    @Test(priority = 5, description = "Validate One-way ticket search results from Chicago, IL,US(ORD) to Miami,FL,US(MIA)" )
    public void validateTicketResults(){


        unitedAirlinesBasePage.onewayRadioButtonLabel.click();

        unitedAirlinesBasePage.fromOriginInputBox.click();
        unitedAirlinesBasePage.fromOriginInputBox.clear();
        unitedAirlinesBasePage.fromOriginInputBox. sendKeys("Chicago,IL,US (ORD)");


        unitedAirlinesBasePage.toDestinationInputBox.click();
        unitedAirlinesBasePage.toDestinationInputBox.sendKeys("Miami, FL, US(MIA)");


        unitedAirlinesBasePage.departDateInputBox.click();
        unitedAirlinesBasePage.departDateInputBox.clear();
        unitedAirlinesBasePage.departDateInputBox.sendKeys("Feb 28");
        unitedAirlinesBasePage.departDateInputBox.click();


        unitedAirlinesBasePage.passengerSelectorButton.click();
        unitedAirlinesBasePage.addAdultPlusSignButton.click();

        unitedAirlinesBasePage.cabinTypeDropdownMenu.click();
        unitedAirlinesBasePage.cabinTypeItems.click();


        unitedAirlinesBasePage.findFlightsButton.click();

        Assert.assertEquals(unitedAirlinesBookingResultPage.departureDateConfirmation.getText(), "DEPART ON: February 28");









    }


}