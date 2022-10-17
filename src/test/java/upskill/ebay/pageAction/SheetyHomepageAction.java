package upskill.ebay.pageAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.SheetyHomepageLocator;
import upskill.utilities.SetupDrivers;

public class SheetyHomepageAction {
	
	SheetyHomepageLocator SheetyHomepageLocatorobj;
	
	public SheetyHomepageAction() {
		SheetyHomepageLocatorobj = new SheetyHomepageLocator();
		PageFactory.initElements(SetupDrivers.driver, SheetyHomepageLocatorobj);
				}

	public void loadSheetyHomepage() {
		SetupDrivers.driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
	}

	public void switchShettyIframe() {
		SetupDrivers.driver.switchTo().frame("iframe-name");
		
		
	}
	
	public void click() {
List<WebElement> framelist = SetupDrivers.driver.findElements(By.id("courses-iframe"));
		
		for(int i = 0; i<(framelist.size());i++){
			SetupDrivers.driver.switchTo().frame(i);
			
			try{
				SheetyHomepageLocatorobj.btnHome.click();	
			} catch (Exception e){
				System.out.println("Element not found in that iframe list");
			}
		}
	}

	public void verifyShetty() throws Exception {
		SheetyHomepageLocatorobj.btnHome.isDisplayed();
		Thread.sleep(3000);
		
	}

	
	

}
