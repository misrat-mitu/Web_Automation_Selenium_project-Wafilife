package Pages;

import org.openqa.selenium.By;

public class MainPage extends BasePage{

    public String url = "https://www.wafilife.com/";

    public By login = By.xpath("//a[@title='আমার অ্যাকাউন্ট']");

    public By লেখক = By.xpath("//span[@class='menu-label-level-0'][contains(text(),'লেখক')]");

    public By nextPage = By.xpath("//span[contains(text(),'জেনারেল বই')]");

    public By book_details = By.xpath("//div[@id='featured_product_slider_wrapper_1509781348']//div[7]//li[1]//div[1]//div[1]//a[2]");




}
