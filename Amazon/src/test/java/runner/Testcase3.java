package runner;
import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LoggerHandler;
import com.aventstack.extentreports.ExtentReports;

import pages.SearchResultsPage;
import pages.addTocart;
import pages.homepage;
import utils.Base;
import utils.Reporter;
import uistore.cart;
import uistore.home;
import uistore.searchPage;
// import utils.Screenshot;
public class Testcase3 extends Base {

    java.util.logging.Logger log =  LoggerHandler.getLogger();
    ExtentReports reporter = Reporter.generateExtentReport();
    searchPage sp = new searchPage();
    // addTocart ac = new addTocart()

    addTocart ac = new addTocart();
    cart cr = new cart();
    
    @Test(priority = 3)
    public void addtocart() throws Throwable{
    	ac.searchProduct1();
    	ac.addtocart_click();	
    	ac.navigateCart();
    	String CartProdName = getText(cr.cartProductName).substring(0,11);
    	Assert.assertEquals(CartProdName, "OnePlus 11R");
    	log.info("Successfully Asserted for Product Cart Page");
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

