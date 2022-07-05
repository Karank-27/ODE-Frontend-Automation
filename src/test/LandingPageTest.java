package test;

import jdk.jfr.Description;
import main.java.EventsClass.LandingPageEvents;
import main.java.EventsClass.TalentMetricsEvents;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class LandingPageTest extends BaseTest {
    LandingPageEvents landingPageEvents;
    TalentMetricsEvents talentMetricsEvents;


@BeforeClass
public void beforeClass()
{

     landingPageEvents = new LandingPageEvents();
    talentMetricsEvents = new TalentMetricsEvents();

}

    @Test(description = "Verify Landing page")
    @Description("Verify if the user is able to view the landing page after logging in")
    public void verifyLandingPage()
    {
            Assert.assertTrue(landingPageEvents.verifyLandingPage());
    }

    @Test(description = "Verify company Search functioanlity")
    @Description("Verify if the user is able to search and select a specific company when searched")
    public void companySearch()
    {
        if(landingPageEvents.verifyLandingPage())
        landingPageEvents.searchCompany("Microsoft Corporation");
        landingPageEvents.selectCompanyFromList();
        landingPageEvents.clickSearch();
        Assert.assertTrue(talentMetricsEvents.verifyTalentMetricsgPage());
    }

    @Test(description = "Verify peer Search functioanlity")
    @Description("Verify if the user is able to search and select a specific company and its peers when searched")
    public void peerSearch()
    {
        if(landingPageEvents.verifyLandingPage())
        landingPageEvents.searchCompany("Microsoft Corporation");
        landingPageEvents.selectCompanyFromList();
        landingPageEvents.searchPeer("Apple Inc.");
        landingPageEvents.selectPeerFromList();
        landingPageEvents.searchPeer("Apple Bank");
        landingPageEvents.selectPeerFromList();
        landingPageEvents.clickSearch();
        Assert.assertTrue(talentMetricsEvents.verifyTalentMetricsgPage());

    }

    @Test(description = "verify video link available")
    @Description("Verify if the demo video link is present and is clickable")
    public void verifyDemoVideo()
    {
        Assert.assertTrue(landingPageEvents.verifyVideoLinkAvailable());
        Assert.assertTrue(landingPageEvents.verifyVideoLinkClickable());
    }

    @Test(description = "verify Contact Support Team button available")
    @Description("Verify if the Contact Support Team button link is present and is clickable")
    public void verifyContactSupportTeam()
    {
        Assert.assertTrue(landingPageEvents.verifyContactSupportTeamAvailable());
        Assert.assertTrue(landingPageEvents.verifyContactSupportTeamClickable());
    }

    @Test(description = "verify List Of Available Countries button available")
    @Description("Verify if the List Of Available Countries button link is present and is clickable")
    public void verifyListOfAvailableCountries()
    {
        Assert.assertTrue(landingPageEvents.verifyistOfAvailableCountriesAvailable());
        Assert.assertTrue(landingPageEvents.verifyListOfAvailableCountriesClickable());
    }


}
