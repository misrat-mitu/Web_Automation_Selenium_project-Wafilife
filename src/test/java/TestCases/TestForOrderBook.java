package TestCases;

import Pages.ViewBookPage;
import Utilities.DriverSetUp;
import org.testng.annotations.Test;

public class TestForOrderBook extends DriverSetUp {

    ViewBookPage viewBookPage = new ViewBookPage();

    @Test
    public void testClickOrderButton() throws InterruptedException {

        // Go to Book Details Page
        viewBookPage.loadPage(viewBookPage.url);

        // Wait for and validate book title
        viewBookPage.waitForElementVisible(viewBookPage.book_title);

        // Wait for and click on Order Now
        viewBookPage.waitForElementVisible(viewBookPage.order_button);
        viewBookPage.clickOnElement(viewBookPage.order_button);
        Thread.sleep(2000);

        // Print or verify message
        System.out.println("Order button is click successfully");
    }
}
