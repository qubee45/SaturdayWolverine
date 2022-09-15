package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import upskill.ebay.pageElements.EbaySearchResultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultAction {
	
	EbaySearchResultLocators EbaySearchResultLocatorsobj;
	
	public EbaySearchResultAction () {
		
		EbaySearchResultLocatorsobj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsobj);
		
	}
	
	public void verifyShoesItems() {
		EbaySearchResultLocatorsobj.txtShoes.isDisplayed();
//		
//		Assert.assertEquals("shoes", EbaySearchResultLocatorsobj.txtShoes.getText());
//		
//		Assert.assertTrue(EbaySearchResultLocatorsobj.txtShoes.isDisplayed());
//		
	}
	public void filterBrand(String brand) {
		if (brand.equals("Adidas"))
		EbaySearchResultLocatorsobj.cbxBrandAdidas.click();
		else if (brand.equals("Nike"))
			EbaySearchResultLocatorsobj.cbxBrandNike.click();
		else if (brand.equals("Unbranded"))
			
			EbaySearchResultLocatorsobj.cbxBrandUnbranded.click();
		else {
			System.out.println("Brand not found, please implement !");
		}
	}
	public void verifyBrandItems(String brand) {
		if (brand.equals("Adidas"))
			EbaySearchResultLocatorsobj.txtShirts.isDisplayed();
			else if (brand.equals("Nike"))
				EbaySearchResultLocatorsobj.txtShoes.isDisplayed();
			else if (brand.equals("Unbranded"))
				
				EbaySearchResultLocatorsobj.txtPants.isDisplayed();
			else {
				System.out.println("Brand not found, please implement !");
			}
		

}
}