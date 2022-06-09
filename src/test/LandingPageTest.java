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
        landingPageEvents.searchCompany("Microsoft Corporation");
        landingPageEvents.selectCompanyFromList();
        landingPageEvents.clickSearch();
        Assert.assertTrue(talentMetricsEvents.verifyTalentMetricsgPage());
    }

    @Test(description = "Verify peer Search functioanlity")
    @Description("Verify if the user is able to search and select a specific company and its peers when searched")
    public void peerSearch()
    {
        landingPageEvents.searchCompany("Microsoft Corporation");
        landingPageEvents.selectCompanyFromList();
        landingPageEvents.searchPeer("Apple Inc.");
        landingPageEvents.selectCompanyFromList();
        landingPageEvents.searchPeer("Apple Bank");
        landingPageEvents.selectCompanyFromList();
        landingPageEvents.clickSearch();
        Assert.assertTrue(talentMetricsEvents.verifyTalentMetricsgPage());

    }

}
