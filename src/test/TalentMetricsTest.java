package test;

import jdk.jfr.Description;
import main.java.EventsClass.TalentMetricsEvents;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class TalentMetricsTest extends BaseTest {
    TalentMetricsEvents talentMetricsEvents;



@BeforeClass
public void beforeClass()
{

     talentMetricsEvents = new TalentMetricsEvents();

}

    @Test(description = "Verify Search functioanlity")
    @Description("Verify if the search functioanlity is working")
    public void searchCompany()
    {
            talentMetricsEvents.searchCompany("Apple Inc.");
            talentMetricsEvents.selectCompanyFromList();
            talentMetricsEvents.clickSearch();
}

    @Test(description = "Verify Search functioanlity")
    @Description("Verify if the search functioanlity is working")
    public void searchCompany2()
    {
        talentMetricsEvents.searchCompany("Microsoft Corporation");
        talentMetricsEvents.selectCompanyFromList();
        talentMetricsEvents.clickSearch();
    }

}
