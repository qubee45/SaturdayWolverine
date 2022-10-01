package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomepageLocators {

	@FindBy(xpath="//input[@placeholder='Search for anything']")
	public WebElement textbxSearch;
	
	@FindBy(xpath="//input[@value='Search']")
	public WebElement btnSearch;
	
	@FindBy(xpath="//a[1][text()='Toys']")
	public WebElement txtToy;
	
	@FindBy(xpath="//a[text()='Electronics'][ancestor :: li]")
	public WebElement txtElectronic;
	
	
}
