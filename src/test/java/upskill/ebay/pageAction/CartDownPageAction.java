package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.CartDownPageLocator;
import upskill.utilities.SetupDrivers;

public class CartDownPageAction {
	
	CartDownPageLocator CartDownPageLocatorobj;
	
	
	public CartDownPageAction() {
		CartDownPageLocatorobj = new CartDownPageLocator();
		PageFactory.initElements(SetupDrivers.driver, CartDownPageLocatorobj);
		
	}
	
	public void switchWindow() {
		for (String winhandle : SetupDrivers.driver.getWindowHandles()) {
			SetupDrivers.driver.switchTo().window(winhandle);}
	}
	
	 public void SelectType() throws Exception {
		 Select dropDown = new Select (CartDownPageLocatorobj.SizeType);
		 dropDown.selectByVisibleText("Big & Tall");
		 Thread.sleep(5000);
		 
		 
	 }
	 public void SelectSize() throws Exception {
		 Select dropDown = new Select (CartDownPageLocatorobj.SizeType);
		 dropDown.selectByVisibleText("4XLT");
		// dropDown.selectByIndex(1);
		 Thread.sleep(5000);
	 }
	 public void SelectColor() throws Exception {
		 Select dropDown = new Select (CartDownPageLocatorobj.ColorShade);
		 dropDown.selectByVisibleText("ash");
		// dropDown.selectByValue("13");
		 Thread.sleep(5000);
	 }
	 public void ShirtQuantity() throws Exception {
		 CartDownPageLocatorobj.txtbxQty.clear();
		 CartDownPageLocatorobj.txtbxQty.sendKeys("2");
		 Thread.sleep(5000);
	 }
	 public void AddtoCart() throws Exception {
		 CartDownPageLocatorobj.btnAddCart.click();
		 Thread.sleep(5000);
	 }
	 }

