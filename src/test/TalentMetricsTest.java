package test;

import jdk.jfr.Description;
import main.java.EventsClass.LandingPageEvents;
import main.java.EventsClass.TalentMetricsEvents;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TalentMetricsTest extends BaseTest {

    LandingPageEvents landingPageEvents;
    TalentMetricsEvents talentMetricsEvents;

    @BeforeClass
    public void beforeClass()
    {

        landingPageEvents = new LandingPageEvents();
        talentMetricsEvents = new TalentMetricsEvents();

    }


    @BeforeTest
    public void beforeTest()
    {
        if(landingPageEvents.verifyLandingPage())
            landingPageEvents.searchCompany("Microsoft Corporation");
        landingPageEvents.selectCompanyFromList();
        landingPageEvents.clickSearch();
    }

    @Test(description = "Verify Talent Metric page")
    @Description("Verify if the user is able to view the Talent Metric page")
    public void verifyTalentMetricPage()
    {

        Assert.assertTrue(talentMetricsEvents.verifyTalentMetricsgPage());
    }


    @Test(description = "verify Top roles supply and demand header visible")
    @Description("Verify if the user is able to view the Top roles supply and demand header in Talent Metric page")
    public void verifyTopRolesSupplyDemandHeader()
    {
        Assert.assertTrue(talentMetricsEvents.verifyTopRolesSupplyDemandHeaderVisible());
    }





}
