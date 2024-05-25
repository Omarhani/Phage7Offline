package dropDown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownPage;

public class DropDownTests extends BaseTests {

    @Test
    public void testSelectFromDropDownList() {
        DropDownPage dropDownPage = homePage.clickOnDropDownLink();
        dropDownPage.selectFromDropDownList("Option 1");

    }
}
