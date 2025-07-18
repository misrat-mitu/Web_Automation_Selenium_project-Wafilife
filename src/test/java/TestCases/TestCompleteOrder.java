package TestCases;

import Pages.MainPage;
import Pages.ViewBookPage;
import Utilities.DriverSetUp;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCompleteOrder extends DriverSetUp {

    //MainPage mainPage = new MainPage();
    ViewBookPage viewBookPage = new ViewBookPage();

    @Test
    public void testUserCanCompleteOrder() throws InterruptedException {

        // Go directly to the book detail page
        viewBookPage.loadPage(viewBookPage.url);

        // Wait for book title to be visible
        viewBookPage.waitForElementVisible(viewBookPage.book_title);

        // Click on "অর্ডার করুন"
        viewBookPage.clickOnElement(viewBookPage.order_button);
        Thread.sleep(2000);

        // Wait for popup and click "অর্ডার সম্পন্ন করুন"
        viewBookPage.waitForElementVisible(viewBookPage.complete_order_Button);
        viewBookPage.clickOnElement(viewBookPage.complete_order_Button);
        Thread.sleep(2000);

    }
}
