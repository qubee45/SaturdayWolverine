package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartDDLocators {
	
	@FindBy(xpath="//select[@name='Size Type']")
	public WebElement sizeTypeDD;
	
	
	@FindBy(xpath="//select[@id='msku-sel-2']")
	public WebElement manSizeDD;
	
	
	@FindBy(xpath="//select[@name='Shade']")
	public WebElement shadeDD;
	
	
	@FindBy(xpath="//input[@class='qtyInput']")
	public WebElement qtyDD;
	

	
	@FindBy(xpath="//a[@id='atcRedesignId_btn']")
	public WebElement addToCart;
	
	
	
}
