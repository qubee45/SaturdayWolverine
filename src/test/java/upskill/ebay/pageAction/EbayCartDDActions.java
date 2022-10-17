package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.EbayCartDDLocators;
import upskill.utilities.SetupDrivers;


public class EbayCartDDActions {

	EbayCartDDLocators EbayCartDDLocatorsObj;
	
	public EbayCartDDActions() {
		EbayCartDDLocatorsObj = new EbayCartDDLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayCartDDLocatorsObj);
				
	}
	
	public void selectSize() throws Exception {
		Select dropDown = new Select(EbayCartDDLocatorsObj.sizeTypeDD);
		dropDown.selectByVisibleText("Big & Tall");
		Thread.sleep(2000);	
	}
	public void menSize() throws Exception {
		Select dropDown = new Select(EbayCartDDLocatorsObj.manSizeDD);
		dropDown.selectByVisibleText("8XLT");;
		Thread.sleep(2000);		
	}
	
	public void selectShade() throws Exception {
		Select dropDown = new Select(EbayCartDDLocatorsObj.shadeDD);
		dropDown.selectByValue("13");
		Thread.sleep(2000);
	}
	
	public void selectQty() throws Exception {
		EbayCartDDLocatorsObj.qtyDD.clear();
		EbayCartDDLocatorsObj.qtyDD.sendKeys("2");	
		Thread.sleep(3000);
	}
	
	public void addToCart() throws Exception {
		EbayCartDDLocatorsObj.addToCart.click();
		Thread.sleep(5000);
		
		
	}
}
