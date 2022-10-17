package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayCartDDActions;

public class EbayCartDDSetps {

	EbayCartDDActions EbayCartDDActionsObj = new EbayCartDDActions();
	
	@When("^Select Size$")
	public void select_Size() throws Throwable {
		EbayCartDDActionsObj.selectSize();
		
	}

	@When("^Select Men Size$")
	public void select_Men_Size() throws Throwable {
		EbayCartDDActionsObj.menSize();
	}

	@When("^Select Shade$")
	public void select_Shade() throws Throwable {
		EbayCartDDActionsObj.selectShade();
	}

	@When("^Select Quantity$")
	public void select_Quantity() throws Throwable {
		EbayCartDDActionsObj.selectQty();
	}

	@Then("^Add to shopping cart$")
	public void add_to_shopping_cart() throws Throwable {
		EbayCartDDActionsObj.addToCart();
		
		
		
	}


	
	
	
}
