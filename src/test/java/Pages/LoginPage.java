package Pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    public String url = "https://www.wafilife.com/my-account";

    public String email = "jmisrat123@gmail.com";
    public String password = "lifeBook*123";

    public String email_error_text = "Unknown email address. Check again or try your username.";
    public String pass_error_text = "Error: The password you entered for the email address jmisrat123@gmail.com is incorrect. Lost your password?";

    public By username_input = By.xpath("//input[@id='username']");

    public By password_input = By.xpath("//input[@id='password']");

    public By login_btn = By.xpath("//input[@name='login']");

    public By email_error_msg = By.xpath("//li[contains(text(),'Unknown email address. Check again or try your use')]");

    public By pass_error_msg = By.xpath("//strong[normalize-space()='Error:']");

}
