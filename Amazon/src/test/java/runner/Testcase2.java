package runner;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LoggerHandler;
import com.aventstack.extentreports.ExtentReports;

import pages.SearchResultsPage;
import pages.homepage;
import utils.Base;
import utils.Reporter;
import uistore.home;
import uistore.searchPage;
// import utils.Screenshot;
public class Testcase2 extends Base {

    java.util.logging.Logger log =  LoggerHandler.getLogger();
    ExtentReports reporter = Reporter.generateExtentReport();;
    homepage Homepage = new homepage();
    SearchResultsPage srp = new SearchResultsPage();
    searchPage sp = new searchPage();
    
    @Test(priority = 2)
    public void SearchProduct() throws IOException, InvalidFormatException{
    	//log.warning("Message");
    	Homepage.searchProduct();
    	srp.ClickOnsearchResult();
    	String prodName = getText(sp.ProducdName2).substring(0,18);
    	Assert.assertEquals(prodName, "Samsung Galaxy S23");
    	log.info("Successfully Asserted for Product Search page");
    }

@BeforeMethod
public void beforeMethod() throws MalformedURLException {
    openBrowser();

}

    @AfterMethod
    public void afterMethod() {
        driver.quit();
        reporter.flush();
        log.info("Browser closed");
        LoggerHandler.closeHandler();
    }
}

