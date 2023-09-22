package uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Base;

@SuppressWarnings("unused")
public class home extends Base {
	
	public static By todaysDeals_label = By.xpath("//a[contains(text(),'Today')]"); 
	//public static By SearchBox = By.id("//input[@id='twotabsearchtextbox']");
	public static By search_label = By.xpath("//input[@aria-label='Search Amazon.in']");
	public static By todaydeal_title = By.xpath("//h1[contains(text(),'Today')]");
	public static By Search_Button = By.xpath("//input[@id='nav-search-submit-button']");
	

//    @FindBy(xpath = "//h1[contains(text(),'Today')]")
//	public WebElement todaysDeals_title;
    
}