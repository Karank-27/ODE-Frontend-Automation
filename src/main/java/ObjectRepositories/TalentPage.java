package main.java.ObjectRepositories;

import org.openqa.selenium.By;


public class TalentPage {



    public  By txtCompany =  By.xpath("//input[@id='company-search-field']");
    public  By btnSeachCompanies =  By.xpath("//span[text()='Search']");
    public  By ulCompanyName =  By.xpath("//ul[@id='company-search-field-popup']");

}
