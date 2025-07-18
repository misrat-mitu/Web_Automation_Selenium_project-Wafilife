package TestCases;

import Pages.LoginPage;
import Pages.MainPage;
import Utilities.DriverSetUp;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends DriverSetUp {

    LoginPage loginPage = new LoginPage();

    @Test
    public void TestUserCanLoginWithValidCredentials(){

        // Step 1: Load the Login Page
        loginPage.loadPage(loginPage.url);

        // Step 2: Enter Email and Password
        loginPage.writeOneElement(loginPage.username_input, loginPage.email);
        loginPage.writeOneElement(loginPage.password_input, loginPage.password);

        // Step 3: Click the Login Button
        loginPage.clickOnElement(loginPage.login_btn);

        // Optional: Print confirmation
        System.out.println("Login successful");

    }
}
