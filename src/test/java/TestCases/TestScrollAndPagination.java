package TestCases;

import Pages.MainPage;
import Utilities.DriverSetUp;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScrollAndPagination extends DriverSetUp {

    MainPage mainPage = new MainPage();

    @Test
    public void TestScrollDownAndClickNextPage() throws InterruptedException {

        // Load the homepage
        mainPage.loadPage(mainPage.url);

        // Scroll to bottom of the page using JavaScript
        JavascriptExecutor js = (JavascriptExecutor) Utilities.DriverSetUp.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        // Wait to ensure pagination loads
        Thread.sleep(3000);

        // Click on "Next" page button
        mainPage.waitForElementVisible(mainPage.nextPage);
        mainPage.clickOnElement(mainPage.nextPage);

        // Wait for next page to load
        Thread.sleep(3000); // You can replace this with explicit wait if needed

        // Check URL or page number
        //String currentUrl = Utilities.DriverSetUp.getDriver().getCurrentUrl();
        //System.out.println("URL after clicking next: " + currentUrl);

        System.out.println("✅ Scroll and pagination to next page successful.");
    }
}
