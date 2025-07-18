package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.time.Duration;

import static Utilities.DriverSetUp.getDriver;

public class BasePage {

    //For finds any locator
    public WebElement getElement(By locator){
        return getDriver().findElement(locator);
    }

    //Click on defined located elements
    public void clickOnElement(By locator){
        getElement(locator).click();
    }

    //for send keys
    public void writeOneElement(By locator, String text){
        getElement(locator).sendKeys(text);
    }

    //Show in Display
    public boolean visibleState(By locators){
        return getElement(locators).isDisplayed();
    }

    //load the url
    public void loadPage(String url){
        getDriver().get(url);
    }

    //for assert
    public String getPageTitle(){
        return getDriver().getTitle();
    }

    //Show the text
    public String getElementText(By locator){
        return getElement(locator).getText();
    }

    //Wait for visible so use (implicite/explicite) wait
    public WebElement waitForElementVisible(By locator){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void scrollToElement(By locator) {
        WebElement elem = getElement(locator);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", elem);
    }

    //For Billing field fillup
    public void typeAndEnter(String xpath, String text) {
        By locator = By.xpath(xpath);
        waitForElementVisible(locator);
        getElement(locator).sendKeys(text);
        getElement(locator).sendKeys(Keys.ENTER);
    }

    public void typeOneElement(By locator, String text) {
        waitForElementVisible(locator);
        getElement(locator).clear();  // Optional: clears existing text
        getElement(locator).sendKeys(text);
    }

    //for Dropdown select
    public void selectFromSelect2Dropdown(By dropdownLocator, String optionText) {
        clickOnElement(dropdownLocator);
        typeAndEnter("//input[@class='select2-search__field']", optionText);
    }



}

/*
    //For screen shot
    public void addScreenShot(String name){
        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
    }
*/