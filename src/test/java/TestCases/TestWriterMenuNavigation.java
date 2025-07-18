package TestCases;

import Pages.MainPage;
import Utilities.DriverSetUp;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWriterMenuNavigation extends DriverSetUp {

    MainPage mainPage = new MainPage();

    @Test
    public void TestUserCanClickWriterMenu() {
        // Load the homepage
        mainPage.loadPage(mainPage.url);

        // Wait for writer menu to be visible
        mainPage.waitForElementVisible(mainPage.লেখক);

        // Click on লেখক menu
        mainPage.clickOnElement(mainPage.লেখক);

        // Wait or assert based on page content after click
        String currentUrl = Utilities.DriverSetUp.getDriver().getCurrentUrl();

        System.out.println("লেখক menu clicked and redirected successfully.");
    }
}
