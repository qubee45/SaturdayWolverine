package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.EbayToyLocator;
import upskill.utilities.SetupDrivers;

public class EbayToyPageAction {
	EbayToyLocator EbayToyLocatorobj;
	
	public EbayToyPageAction() {
		EbayToyLocatorobj = new EbayToyLocator();
		PageFactory.initElements(SetupDrivers.driver, EbayToyLocatorobj);
	}
	
	public void ToyCategory() {
		EbayToyLocatorobj.ViewToys.isDisplayed();
	}
}
