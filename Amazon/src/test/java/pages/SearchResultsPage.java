package pages;

import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import java.io.IOException;
import java.util.Map;
import uistore.searchPage;
import utils.Reporter;
import utils.Screenshot;

public class SearchResultsPage extends Base  {

//    private Map<String, String> testData; 

    java.util.logging.Logger log = LoggerHandler.getLogger();
    ExtentReports reporter = Reporter.generateExtentReport();
    ExcelReader file = new ExcelReader();
    searchPage sp = new searchPage();
    ExtentTest test = Reporter.generateExtentReport().createTest("Product Search", "Asert Search");

    public void ClickOnsearchResult() throws IOException{
    	try{
	    	
            ClickOnElement(sp.ProducdName2);
	    	log.info("product found");
            test.log(Status.PASS, "ClickOnsearchResult");
	    }
    catch(Exception ex){
        ex.printStackTrace();
        String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, "ClickOnsearchResultError");
        test.fail("Failed to execute ClickOnsearchResult", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());     
    }
    	
    }
    
}
   
      



	
