package main.java.EventsClass;

import main.java.ObjectRepositories.LandingPage;
import main.java.utils.Resources;
import test.BaseTest;



// This class contains events(methods) related to Talent metrics page
public class LandingPageEvents {

    LandingPage tl = new LandingPage();


    public boolean verifyLandingPage()
    {
        Resources.explicitWait(tl.hdrLandingPage);
        return BaseTest.driver.findElement(tl.hdrLandingPage).isDisplayed();
    }

    public void searchCompany(String companyName)
    {
        try {
            Resources.explicitWait(tl.txtCompany);
            BaseTest.driver.findElement(tl.txtCompany).clear();
            for (int i = 0; i < companyName.length(); i++) {
                char c = companyName.charAt(i);
                String s = new StringBuilder().append(c).toString();
                Thread.sleep(1000);
                BaseTest.driver.findElement(tl.txtCompany).sendKeys(s);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
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
        Resources.explicitWait(tl.btnSeachCompanies);
        BaseTest.driver.findElement(tl.btnSeachCompanies).click();
    }
    public void searchPeer(String companyName)
    {
        try {
            Resources.explicitWait(tl.txtPeer);
            BaseTest.driver.findElement(tl.txtPeer).clear();
            for (int i = 0; i < companyName.length(); i++) {
                char c = companyName.charAt(i);
                String s = new StringBuilder().append(c).toString();
                Thread.sleep(1000);
                BaseTest.driver.findElement(tl.txtPeer).sendKeys(s);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public boolean verifyVideoLinkAvailable()
    {
        Resources.explicitWait(tl.linkDemoVideo);
        return BaseTest.driver.findElement(tl.linkDemoVideo).getAttribute("href").equals("https://knownow.intranet.mckinsey.com/video/6292305094001");
    }

    public boolean verifyVideoLinkClickable()
    {
        Resources.explicitWait(tl.linkDemoVideo);
        return BaseTest.driver.findElement(tl.linkDemoVideo).isEnabled();

    }

    public boolean verifyContactSupportTeamAvailable()
    {
        Resources.explicitWait(tl.linkContactSupportTeam);
        return BaseTest.driver.findElement(tl.linkContactSupportTeam).getAttribute("href").equals("mailto:OrgIntelligence@mckinsey.com?subject=%5BODE%20Issue%20Report%5D");
    }

    public boolean verifyContactSupportTeamClickable()
    {
        Resources.explicitWait(tl.linkContactSupportTeam);
        return BaseTest.driver.findElement(tl.linkContactSupportTeam).isEnabled();

    }

    public boolean verifyistOfAvailableCountriesAvailable()
    {
        Resources.explicitWait(tl.linkListOfAvailableCountries);
        return BaseTest.driver.findElement(tl.linkListOfAvailableCountries).getAttribute("href").equals("https://mckinsey.box.com/s/4blal9rbz2qsdd54ke91i0aevmje7x94");
    }

    public boolean verifyListOfAvailableCountriesClickable()
    {
        Resources.explicitWait(tl.linkListOfAvailableCountries);
        return BaseTest.driver.findElement(tl.linkListOfAvailableCountries).isEnabled();

    }
    public void selectPeerFromList()
    {
        try {
            Resources.explicitWait(tl.ulPeerName);
            BaseTest.driver.findElement(tl.ulPeerName).click();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
