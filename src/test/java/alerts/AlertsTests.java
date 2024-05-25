package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.JSAlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests {

    @Test
    public void testAcceptAlert() {
        JSAlertsPage jsAlertsPage = homePage.clickOnJSAlertsLink();
        jsAlertsPage.clickOnJSAlertButton();
        jsAlertsPage.acceptAlert();
        String actualResult = jsAlertsPage.getValidationMessage();
        String expectedResult = "You successfully clicked an alert";
        assertEquals(actualResult, expectedResult);
    }
}
