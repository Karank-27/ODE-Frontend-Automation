package main.java.EventsClass;

import main.java.ObjectRepositories.LandingPage;
import main.java.utils.Resources;
import test.BaseTest;



// This class contains events(methods) related to Talent metrics page
public class LandingPageEvents {

    LandingPage tl = new LandingPage();


    public boolean verifyLandingPage()
    {
        return BaseTest.driver.findElement(tl.hdrLandingPage).isDisplayed();
    }

    public void searchCompany(String companyName)
    {
        BaseTest.driver.findElement(tl.txtCompany).sendKeys(companyName);
    }

    public void selectCompanyFromList()
    {
        try {
            Resources.explicitWait(tl.ulCompanyName);
            BaseTest.driver.findElement(tl.ulCompanyName).click();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void clickSearch()
    {
        BaseTest.driver.findElement(tl.btnSeachCompanies).click();
    }
    public void searchPeer(String companyName)
    {
        BaseTest.driver.findElement(tl.txtPeer).sendKeys(companyName);
    }

}
