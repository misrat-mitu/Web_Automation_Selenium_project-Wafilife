package TestCases;

import Pages.MainPage;
import Utilities.DriverSetUp;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMainPage extends DriverSetUp {

    MainPage mainPage = new MainPage();


    @Test
    public void TestMainPageTitle(){
        mainPage.loadPage(mainPage.url);
        //Assert.assertEquals(mainPage.getPageTitle(),mainPage.title);
    }

}
