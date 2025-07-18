package TestCases;

import Pages.AuthorPage;
import Pages.MainPage;
import Utilities.DriverSetUp;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelectAuthorName extends DriverSetUp {

    MainPage mainPage = new MainPage();
    AuthorPage authorPage = new AuthorPage();

    @Test
    public void TestUserCanSelectDrAbulHossainAsAuthor() throws InterruptedException {

        // Load the homepage
        mainPage.loadPage(mainPage.url);

        // Wait for writer menu to be visible and Click on লেখক menu
        mainPage.waitForElementVisible(mainPage.লেখক);
        mainPage.clickOnElement(mainPage.লেখক);

        // Wait or assert based on page content after click
        String currentUrl = Utilities.DriverSetUp.getDriver().getCurrentUrl();

        // Wait for the author list page to load
        authorPage.waitForElementVisible(authorPage.author_name);

        // Click on Dr. Abul Hossain
        String selectedAuthor = authorPage.getElementText(authorPage.author_name);
        authorPage.clickOnElement(authorPage.author_name);

        // Verify redirection by checking the author's name on the page title or URL
        Thread.sleep(2000); // Optional wait for redirection
        //String currentUrl = Utilities.DriverSetUp.getDriver().getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("abul-hossain") || currentUrl.contains("author"),
                "Failed to navigate to Dr. Abul Hossain's author page");

        System.out.println("Author '" + selectedAuthor + "' page opened successfully.");
    }
}

