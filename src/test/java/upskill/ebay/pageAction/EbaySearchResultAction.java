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
		if (brand.equals("Adidas")) {
		EbaySearchResultLocatorsobj.cbxAdidas.click();
		}
		else if (brand.equals("Nike"))
		{
			EbaySearchResultLocatorsobj.cbxNike.click();
		}
		else if (brand.equals("Unbranded"))
		{
			EbaySearchResultLocatorsobj.cbxUnbranded.click();
		}
		else {
			System.out.println("Brand not found, please implement !");
		}
	}
	public void verifyBrandItems(String brand) {
		if (brand.equals("Adidas"))
		{
			EbaySearchResultLocatorsobj.txtShirts.isDisplayed();
		}
			else if (brand.equals("Nike"))
			{	
				EbaySearchResultLocatorsobj.txtShoes.isDisplayed();
			}
			else if (brand.equals("Unbranded"))
			{
				EbaySearchResultLocatorsobj.txtPants.isDisplayed();
			}
			else {
				System.out.println("Brand not found, please implement !");
			}
		

}
	
	public void SwitchWindow() {
		for (String winhandle: SetupDrivers.driver.getWindowHandles()) {
			SetupDrivers.driver.switchTo().window(winhandle);
		}
	}
	
	public void filterRegion(String region) {
		if (region.equals("China")) {
			
			EbaySearchResultLocatorsobj.linkCountry.click();
		EbaySearchResultLocatorsobj.cbxChina.click();
		}
		else if (region.equals("Bangladesh"))
		{
			EbaySearchResultLocatorsobj.cbxBangladesh.click();
		}
		else if (region.equals("United States"))
		{
			EbaySearchResultLocatorsobj.cbxUSA.click();
		}
		else {
			System.out.println("Brand not found, please implement !");
		}
	}
	public void verifyBrandRegion(String region) {
		if (region.equals("China"))
		{
			EbaySearchResultLocatorsobj.txtShoes.isDisplayed();
		}
			else if (region.equals("Bangladesh"))
			{	
				EbaySearchResultLocatorsobj.txtShirts.isDisplayed();
			}
			else if (region.equals("United States"))
			{
				EbaySearchResultLocatorsobj.txtPants.isDisplayed();
			}
			else {
				System.out.println("Brand not found, please implement !");
			}
		

}

		public void firstShirtItem() {
			EbaySearchResultLocatorsobj.linkShirt.click();
			
			
		}
		public void switchNewWindow() {
			for(String winhandle: SetupDrivers.driver.getWindowHandles()){
				SetupDrivers.driver.switchTo().window(winhandle);	
			}


		}
}