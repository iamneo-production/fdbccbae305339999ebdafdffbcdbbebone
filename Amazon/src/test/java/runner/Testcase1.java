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
import pages.homepage;
import utils.Base;
import utils.Reporter;
import utils.Screenshot;
import uistore.home;
public class Testcase1 extends Base {

    java.util.logging.Logger log =  LoggerHandler.getLogger();
    //ExtentTest test = Reporter.generateExtentReport().createTest("Title Test", "Execution for Title test");
    homepage Homepage = new homepage();
    home td = new home();

    
    @Test(priority = 0)
    public void todaysDeal() throws IOException, InvalidFormatException{
    	Homepage.todaysdeals_click();	
       Screenshot.getScreenShot(driver, "Todays Deal tab opened");
    	String title = driver.getTitle();
    	Assert.assertEquals(title,"Amazon.in - Today's Deals");
    	log.info("Successfully Asserted for Todays Deals page");
    	
    }

@BeforeMethod
public void beforeMethod() throws MalformedURLException {
    openBrowser();
    //reporter = Reporter.generateExtentReport();
}

    @AfterMethod
    public void afterMethod() {
        driver.quit();
        //Sreporter.flush();
        log.info("Browser closed");
        LoggerHandler.closeHandler();
    }
}

