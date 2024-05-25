package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private final By formAuthenticationLink = By.linkText("Form Authentication");

    private final By dynamicLoadingLink = By.linkText("Dynamic Loading");

    private final By dropDownLink = By.linkText("Dropdown");

    private final By jsAlertsLink = By.linkText("JavaScript Alerts");

    public LoginPage clickOnFormAuthenticationLink(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
    public DynamicLoadingPage clickOnDynamicLoadingLink(){
        driver.findElement(dynamicLoadingLink).click();
        return new DynamicLoadingPage(driver);
    }

    public DropDownPage clickOnDropDownLink(){
        driver.findElement(dropDownLink).click();
        return new DropDownPage(driver);
    }

    public JSAlertsPage clickOnJSAlertsLink(){
        driver.findElement(jsAlertsLink).click();
        return new JSAlertsPage(driver);
    }
}
