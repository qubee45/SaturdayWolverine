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


}
