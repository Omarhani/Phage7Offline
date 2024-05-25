package frame;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FramePage;

public class FrameTests extends BaseTests {

    FramePage framePage;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        framePage = new FramePage(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://demo.automationtesting.in/Frames.html");
    }

    @Test
    public void testFrame(){
        framePage.insertInTextField("text");
        framePage.clickOnIframeWithInAnIframe();
    }

}
