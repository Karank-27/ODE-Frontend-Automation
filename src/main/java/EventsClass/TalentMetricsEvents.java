package main.java.EventsClass;

import main.java.ObjectRepositories.TalentMetricsPage;
import test.BaseTest;

public class TalentMetricsEvents {

    TalentMetricsPage tl = new TalentMetricsPage();


    public boolean verifyTalentMetricsgPage()
    {
        return BaseTest.driver.findElement(tl.hdrTalentMetricsPage).isDisplayed();
    }


    public boolean verifyTopRolesSupplyDemandHeaderVisible()
    {
        return BaseTest.driver.findElement(tl.hdrTopRolesSupply).isEnabled() &&
         BaseTest.driver.findElement(tl.hdrTopRolesDemand).isEnabled();
    }





}
