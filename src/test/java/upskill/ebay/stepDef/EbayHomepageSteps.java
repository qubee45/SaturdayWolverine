package upskill.ebay.stepDef;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomepageAction;

public class EbayHomepageSteps {
	
	EbayHomepageAction EbayHomepageActionobj= new EbayHomepageAction();
	
	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
	    
	}

	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
		
		//EbayHomepageActionobj.searchShoes();
		
	   
	}
	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		
		EbayHomepageActionobj.searchItems(items);
	}


	@Given("^Search for Shirt$")
	public void search_for_Shirt() throws Throwable {
		EbayHomepageActionobj.searchShirt();
		
		
	}
	@When("^Clicked on Toys$")
	public void clicked_on_Toys() throws Throwable {
		EbayHomepageActionobj.VerifyToys();
	}
	@When("^clicked on Electronics$")
	public void clicked_on_Electronics() throws Throwable {
		EbayHomepageActionobj.VeryfyElectronics();
	}
	@When("^Mouse Hover to MyEbay Summary$")
	public void mouse_Hover_to_MyEbay_Summary() throws Throwable {
		EbayHomepageActionobj.mouseHoverMyEbay();
	}

	@Then("^Click on Summary$")
	public void click_on_Summary() throws Throwable {
		EbayHomepageActionobj.clickEbaySummary();
	}
}
