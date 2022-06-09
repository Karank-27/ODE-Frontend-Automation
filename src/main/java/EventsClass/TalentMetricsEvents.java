package main.java.EventsClass;

import main.java.ObjectRepositories.TalentPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.BaseTest;

public class TalentMetricsEvents {

    TalentPage tl = new TalentPage();

    public void searchCompany(String companyName)
    {
        BaseTest.driver.findElement(tl.txtCompany).sendKeys(companyName);
    }

    public void selectCompanyFromList()
    {
        new WebDriverWait(BaseTest.driver, 10).until(ExpectedConditions.elementToBeClickable(BaseTest.driver.findElement(tl.ulCompanyName)));
        BaseTest.driver.findElement(tl.ulCompanyName).click();
    }
    public void clickSearch()
    {
        BaseTest.driver.findElement(tl.btnSeachCompanies).click();
    }


}
