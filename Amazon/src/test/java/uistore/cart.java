package uistore;

import org.openqa.selenium.By;
import utils.Base;

public class cart extends Base {
	
	public static By addtocart_btn = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
	public static By addtoCart_btn1 = By.xpath("//input[@id='add-to-cart-button']");
	public static By cart_btn = By.xpath("//span[@id='attach-sidesheet-view-cart-button']");
	public static By cartProductName = By.xpath("(//span[contains(text(),'OnePlus 11R')])[2]");
    
}