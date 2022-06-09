package main.java.EventsClass;

import main.java.ObjectRepositories.TalentMetricsPage;
import test.BaseTest;

public class TalentMetricsEvents {

    TalentMetricsPage tl = new TalentMetricsPage();



    public boolean verifyTalentMetricsgPage()
    {
        return BaseTest.driver.findElement(tl.hdrTalentMetricsPage).isDisplayed();
    }







}
