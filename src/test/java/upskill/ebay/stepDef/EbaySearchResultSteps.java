package upskill.ebay.stepDef;



import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbaySearchResultAction;

public class EbaySearchResultSteps {
	
	EbaySearchResultAction EbaySearchResultActionobj=new EbaySearchResultAction();
	
	@Then("^Item list should have only shoes related products$")
	public void item_list_should_have_only_shoes_related_products() throws Throwable {
		
		EbaySearchResultActionobj.verifyShoesItems();
	   
	}
	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {
		EbaySearchResultActionobj.filterBrand(brand);
	   
	}

	@Then("^Item list should have products of \"([^\"]*)\"$")
	public void item_list_should_have_products_of(String brand) throws Throwable {
		
		EbaySearchResultActionobj.verifyBrandItems(brand);
	}
	
	@When("^Region of Manufacture \"([^\"]*)\"$")
	public void region_of_Manufacture(String region) throws Throwable {
		EbaySearchResultActionobj.filterRegion(region);
	}

	@Then("^Item list should from \"([^\"]*)\"$")
	public void item_list_should_from(String region) throws Throwable {
		EbaySearchResultActionobj.verifyBrandRegion(region);
	}
	
	
	@When("^Select the first shirt on item list$")
	public void select_the_first_shirt_on_item_list() throws Throwable {
	EbaySearchResultActionobj.firstShirtItem();
	EbaySearchResultActionobj.switchNewWindow();
		
		
	}
	
	
}