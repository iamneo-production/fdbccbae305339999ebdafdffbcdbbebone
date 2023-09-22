package pages;

import java.io.IOException;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import java.util.Map;
import uistore.home;
import utils.Reporter;
import utils.Screenshot;

public class homepage extends Base  {

    private Map<String, String> testData; 

    java.util.logging.Logger log = LoggerHandler.getLogger();
    ExtentReports reporter = Reporter.generateExtentReport();
    ExcelReader file = new ExcelReader();
    home td = new home();
     ExtentTest test = Reporter.generateExtentReport().createTest("Assert check", "Assert Today's Deal page");

   

    
    public void todaysdeals_click() {
        
            test.log(Status.PASS, "Browser opened");
           

        
        try {
            ClickOnElement(td.todaysDeals_label);
            System.out.println("Inside TodaysDeals2");
            Screenshot.getScreenShot(driver, "Loaded Today's Deals");
            test.log(Status.PASS, "todaysdeals_clicked");

        } catch (Exception e) {
            // Handle the exception as needed
            e.printStackTrace(); // Replace this with appropriate error handling or logging
            String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, "todaysdealsError");
            test.fail("Failed to Enter todaysdeals", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
        }
    }

    public void searchProduct() {
        try {
            String data = ReadData("Productslist", 1, "MobilePhones");
            ClickOnElement(td.search_label);
            sendKeys(td.search_label, data);
            ClickOnElement(td.Search_Button);
            test.log(Status.PASS, "searchProduct");
        } catch (InvalidFormatException | IOException e) {
            e.printStackTrace();
        }
        
    }

    
      
}


