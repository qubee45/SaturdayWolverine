package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	
	@FindBy(xpath="//span[2][contains(text(),'Shoes')]")
	public WebElement txtShoes;
	
	@FindBy(xpath="//span[2][contains(text(),'Shirt')]")
	public WebElement txtShirts;
	
	@FindBy(xpath="//span[2][contains(text(),'Pants')]")
	public WebElement txtPants;
	
	@FindBy(xpath="//input[@aria-label='adidas']")
	public WebElement cbxAdidas;
	
	@FindBy(xpath="//input[@aria-label='Nike']")
	public WebElement cbxNike;
	
	@FindBy(xpath="//input[@aria-label='Unbranded']")
	public WebElement cbxUnbranded;

	@FindBy(xpath="//span[contains(text(),'Big & Tall Cotton Tee')]")
	public WebElement linkShirt;
}
