package main.java.ObjectRepositories;

import org.openqa.selenium.By;
//This page contains locators from the landing page

public class LandingPage {

    public By hdrLandingPage = By.xpath("//h2[text()='Better understand your client’s talent, structure and culture.']");

    public  By txtCompany =  By.xpath("//input[@id='company-search-field']");
    public  By btnSeachCompanies =  By.xpath("//span[text()='Search']");
    public  By ulCompanyName =  By.xpath("//ul[@id='company-search-field-popup']");

    public By txtPeer = By.xpath("//input[@id='multiple-company-search-field']");
}
