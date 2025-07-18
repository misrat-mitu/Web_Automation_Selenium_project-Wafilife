package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class DriverSetUp {

    //When user can use command line for checking which browser that user want
    private static String browser_name = System.getProperty("browser","edge");


    private static final ThreadLocal<WebDriver> DRIVER_THREAD_LOCAL = new ThreadLocal<>();


    //Seater Method
    public static void setDriver(WebDriver driver){
        DriverSetUp.DRIVER_THREAD_LOCAL.set(driver);
    }

    //Geter Method
    public static WebDriver getDriver(){
        return DRIVER_THREAD_LOCAL.get();
    }



    //public WebDriver driver;

    @BeforeMethod
    public void startBrowser() {
        WebDriver driver = getBrowser(browser_name);            //For browser create
        //driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        setDriver(driver);                             //for Browser set in DRIVER_THREAD_LOCAL
    }

    @AfterMethod
    public void closeBrowser(){
        getDriver().quit();
    }


    //It works for which browser that I want for my work
    public WebDriver getBrowser(String name){
        if (name.equalsIgnoreCase("Edge"))
            return new EdgeDriver();
        else if (name.equalsIgnoreCase("Chrome"))
            return new ChromeDriver();
        else if (name.equalsIgnoreCase("Firefox"))
            return new FirefoxDriver();
        else {
            throw new RuntimeException("Browser is not available with the given name:" + name);
        }
    }
}
