package Pages;

import org.openqa.selenium.By;

public class ViewBookPage extends BasePage{

    public String url = "https://www.wafilife.com/manush-muluto-shibir/dp/1215056";

    public By book_title = By.xpath("//h1[contains(text(),'মানুষ মূলত শিবির')]");

    public By order_button = By.xpath("//div[@class='body-wrapper']//button[2]");

    public By complete_order_Button = By.xpath("//span[contains(text(),'অর্ডার সম্পন্ন করুন')]");
}
