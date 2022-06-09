package main.java.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.BaseTest;

public class Resources {

    // this class contains methods which can be resused in every event class. for eg explicit wait, read write excel, etc


    public static void explicitWait( By locator)
    {
        WebDriverWait wait = new WebDriverWait(BaseTest.driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
}
