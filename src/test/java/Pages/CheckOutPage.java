package Pages;

import org.openqa.selenium.By;

public class CheckOutPage extends BasePage{

    public String url = "https://www.wafilife.com/checkout";

    public By name_input = By.xpath("//input[@id='billing_first_name']");
    public By phone_number = By.xpath("//input[@id='billing_phone']");
    public By email_input = By.xpath("//input[@id='billing_email']");
    public By district_dropdown = By.xpath("//span[@id='select2-billing_state-container']");
    public By upazila_dropdown = By.xpath("//select[@id='billing_area']");
    public By address = By.xpath("//textarea[@id='billing_address_1']");

    public By agreeCheckbox = By.xpath("//input[@id='terms']");
    public By placeOrderButton = By.xpath("//button[@id='place_order']");
}
