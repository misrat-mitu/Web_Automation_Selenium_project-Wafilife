package TestCases;

import Pages.MainPage;
import Pages.ViewBookPage;
import Utilities.DriverSetUp;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestViewBookDetails extends DriverSetUp {

    MainPage mainPage = new MainPage();
    ViewBookPage viewBookPage = new ViewBookPage();

    @Test
    public void testUserCanViewBookDetails() throws InterruptedException {

        // Open homepage
        mainPage.loadPage(mainPage.url);

        // Scroll to book link
        viewBookPage.loadPage(viewBookPage.url);
        viewBookPage.waitForElementVisible(viewBookPage.book_title);

//        mainPage.waitForElementVisible(mainPage.book_details);
//        mainPage.scrollToElement(mainPage.book_details);

        // Click it
        //mainPage.clickOnElement(mainPage.book_details);

        // Wait for book details page to load (wait for title)
        viewBookPage.waitForElementVisible(viewBookPage.book_title);

        // Assertion
        String titleText = viewBookPage.getElementText(viewBookPage.book_title);
        Assert.assertTrue(titleText.contains("মানুষ মূলত শিবির"), "Book title mismatch or page didn't load fully.");

        System.out.println(" Book detail page loaded with title: " + titleText);
    }
}
