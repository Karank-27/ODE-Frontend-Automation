package main.java.ObjectRepositories;

import org.openqa.selenium.By;
//This page contains locators from the login page
public class LoginPage {

    public By txtUserName = By.xpath("//input[@name ='username']");
    public  By btnContinue =  By.xpath(("//button[text()='Continue']"));

    public  By txtPassword =  By.id(("okta-signin-password"));

    public  By btnSubmit =  By.id(("okta-signin-submit"));

    public  By btnAgreeAndContinue =  By.xpath(("//span[text()='Agree & Continue']"));
}
