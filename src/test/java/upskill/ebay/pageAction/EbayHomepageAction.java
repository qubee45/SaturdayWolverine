package upskill.ebay.pageAction;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import upskill.ebay.pageElements.EbayHomepageLocators;
import upskill.utilities.SetupDrivers;

public class EbayHomepageAction {
	
		EbayHomepageLocators EbayHomepageLocatorsobj;
		
		public EbayHomepageAction() { 
		
		EbayHomepageLocatorsobj = new EbayHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomepageLocatorsobj);
		}
		
		public void searchShoes() {
			EbayHomepageLocatorsobj.textbxSearch.sendKeys("Shoes");
			EbayHomepageLocatorsobj.btnSearch.click();
		}
		 public void searchItems(String items) {
			 EbayHomepageLocatorsobj.btnSearch.sendKeys(items);
			 EbayHomepageLocatorsobj.btnSearch.clear();
		 }
	
		 
		 
		 
		 
		 
		 
		 public void seleniumWaits() {
			 System.out.println(SetupDrivers.driver.getTitle());
			 SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 
			 WebDriverWait wait = new WebDriverWait(SetupDrivers.driver,20);
			 wait.until(ExpectedConditions.elementToBeClickable(EbayHomepageLocatorsobj.textbxSearch));
			 
			FluentWait fw = new FluentWait(SetupDrivers.driver);
						fw.withTimeout(10, TimeUnit.SECONDS);
						fw.pollingEvery(5, TimeUnit.SECONDS);
						fw.ignoring(NoSuchElementException.class);
						fw.withMessage("Time exceeded");
						
			
			 
		 }
		 
	}


