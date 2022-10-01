package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayToyLocator {
	
	@FindBy(xpath="//h2[1][text()='Shop by Category']")
	public WebElement ViewToys;

}
