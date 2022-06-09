package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import main.java.EventsClass.LoginEvents;
import main.java.EventsClass.LandingPageEvents;
import main.java.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


public class BaseTest {


    public static WebDriver driver ;
    LoginEvents loginEvent;
    LandingPageEvents landingPageEvents;



    @BeforeMethod
 //   @Parameters(value={"browserName"})
    public void beforeMethod()
    {
        setupDriver("Chrome");
        driver.manage().window().maximize();
        driver.get(Constants.url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginEvent = new LoginEvents(driver);

        landingPageEvents = new LandingPageEvents();
        loginEvent.logins();


    }




    @AfterMethod
    public void afterMethod()
    {
        driver.quit();
    }



//    @AfterTest


    public void setupDriver(String browserName)
    {
        if(browserName.equalsIgnoreCase("Chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        else if(browserName.equalsIgnoreCase("Firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else    //By default value : Chrome
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

    }

    public static WebDriver getdriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            return driver;
        } else {
            return driver;
        }
    }

}
