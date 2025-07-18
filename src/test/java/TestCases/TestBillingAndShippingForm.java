package TestCases;

import Pages.CheckOutPage;
import Pages.ViewBookPage;
import Utilities.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestBillingAndShippingForm extends DriverSetUp {

    ViewBookPage viewBookPage = new ViewBookPage();
    CheckOutPage checkoutPage = new CheckOutPage();

    @Test
    public void testUserCanFillBillingForm() throws InterruptedException {

        // 1. Go to Book Page
        viewBookPage.loadPage(viewBookPage.url);
        viewBookPage.waitForElementVisible(viewBookPage.book_title);

        // 2. Click "অর্ডার করুন"
        viewBookPage.clickOnElement(viewBookPage.order_button);
        Thread.sleep(2000);

        // 3. Click "অর্ডার সম্পন্ন করুন "
        viewBookPage.waitForElementVisible(viewBookPage.complete_order_Button);
        viewBookPage.clickOnElement(viewBookPage.complete_order_Button);
        Thread.sleep(3000);

        // 4. Fill Billing Info (assuming checkout page is loaded now)
        checkoutPage.typeOneElement(checkoutPage.name_input, "Misrat Jahan");
        checkoutPage.typeOneElement(checkoutPage.phone_number, "017XXXXXXXX");
        checkoutPage.typeOneElement(checkoutPage.email_input, "jmisrat123@gmail.com");

        // 5. Select District (Dropdown with search)
        checkoutPage.clickOnElement(checkoutPage.district_dropdown);
        checkoutPage.typeAndEnter("//input[@class='select2-search__field']", "Dhaka");

        // 6. Select Upazila (Dropdown with search)
        WebElement selectElement = getDriver().findElement(By.xpath("//select[@id='billing_area']//option[@value='492'][contains(text(),'আগারগাঁও')]"));
        Select select = new Select(selectElement);
        checkoutPage.clickOnElement(checkoutPage.upazila_dropdown);
        checkoutPage.typeAndEnter("//input[@class='select1-search__field']", "আগারগাঁও");

        // 7. Enter Address
        checkoutPage.typeOneElement(checkoutPage.address, "House 12, Road 3, Dhanmondi");

        // 8. Click on Agree Checkbox
        checkoutPage.clickOnElement(checkoutPage.agreeCheckbox);

        // 9. Submit Order
        checkoutPage.clickOnElement(checkoutPage.placeOrderButton);

        Thread.sleep(3000);
    }
}
