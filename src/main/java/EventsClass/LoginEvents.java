package main.java.EventsClass;

import io.qameta.allure.Step;
import main.java.ObjectRepositories.LoginPage;
import main.java.utils.Resources;
import org.openqa.selenium.WebDriver;

// This class contains events(methods) related to login page
public class LoginEvents {
    WebDriver browserdriver;
    public LoginEvents( WebDriver driver)
    {
        browserdriver = driver;
    }

LoginPage lg = new LoginPage();

    @Step("Login step with username and password")
    public void logins()  {
        try {

            Resources.explicitWait(lg.txtUserName);
            browserdriver.findElement(lg.txtUserName).click();
            browserdriver.findElement(lg.txtUserName).sendKeys("automation1@nomfa.mckinsey.id");
            Resources.explicitWait(lg.btnContinue);
            browserdriver.findElement(lg.btnContinue).click();
            Resources.explicitWait(lg.txtPassword);
            Resources.explicitWait(lg.txtPassword);
            browserdriver.findElement(lg.txtPassword).sendKeys(("ZA7x46y7TNUXM5yY"));
            Resources.explicitWait(lg.btnSubmit);
            browserdriver.findElement(lg.btnSubmit).click();
            Resources.explicitWait(lg.btnAgreeAndContinue);
            Resources.explicitWait(lg.btnAgreeAndContinue);
            browserdriver.findElement(lg.btnAgreeAndContinue).click();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }



}
