package Pages;

import org.openqa.selenium.By;

public class AuthorPage extends BasePage{

    public String url = "https://www.wafilife.com/cat/books/author";

    public By author_name = By.xpath("//h3[normalize-space()='Dr. Abul Hossain']");
}
