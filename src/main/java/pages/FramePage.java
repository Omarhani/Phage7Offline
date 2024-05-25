package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage {

    WebDriver driver;

    public FramePage(WebDriver driver) {
        this.driver = driver;
    }
    private final String frame = "singleframe";

    private final By textField = By.xpath("//input[@type='text']");

    private final By iframeWithInAnIframe = By.xpath("//a[contains(text(),'Iframe with in an Iframe')]");

    public void insertInTextField (String text){
        switchToFrame();
        driver.findElement(textField).sendKeys(text);
        switchToParent();
    }
    private void switchToFrame(){
        driver.switchTo().frame(frame);
    }
    private void switchToParent(){
        driver.switchTo().parentFrame();
    }

    public void clickOnIframeWithInAnIframe(){
        driver.findElement(iframeWithInAnIframe).click();
    }
}
