package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	
	@FindBy(xpath="//span[2][contains(text(),'shoes')]")
	public WebElement txtShoes;
	
	@FindBy(xpath="//span[2][contains(text(),'shirts')]")
	public WebElement txtShirts;
	
	@FindBy(xpath="//span[2][contains(text(),'pants')]")
	public WebElement txtPants;
	
	@FindBy(xpath="//input[@aria-label='adidas']")
	public WebElement cbxBrandAdidas;
	
	@FindBy(xpath="//input[@aria-label='Nike']")
	public WebElement cbxBrandNike;
	
	@FindBy(xpath="//input[@aria-label='Unbranded']")
	public WebElement cbxBrandUnbranded;

}
