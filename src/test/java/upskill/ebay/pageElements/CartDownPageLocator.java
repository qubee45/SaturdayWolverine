package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartDownPageLocator {
	
	@FindBy(xpath="//select[@name='Size Type']")
	public WebElement SizeType;
	
	@FindBy(xpath="//select[@id='msku-sel-2']")
	public WebElement MenSize;
	
	@FindBy(xpath="//select[@name='Shade']")
	public WebElement ColorShade;
	
	@FindBy(xpath="//input[@id='qtyTextBox']")
	public WebElement txtbxQty;
	
	@FindBy(xpath="//a[@id='atcRedesignId_btn']")
	public WebElement btnAddCart;
}
