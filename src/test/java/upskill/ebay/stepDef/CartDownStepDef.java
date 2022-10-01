package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.CartDownPageAction;

public class CartDownStepDef {
	CartDownPageAction CartDownPageActionobj= new CartDownPageAction();

@When("^Select Size$")
public void select_Size() throws Throwable {
	CartDownPageActionobj.switchWindow();
	CartDownPageActionobj.SelectType();
}

@When("^Select Men Size$")
public void select_Men_Size() throws Throwable {
	CartDownPageActionobj.SelectSize();
}

@When("^Select Shade$")
public void select_Shade() throws Throwable {
	CartDownPageActionobj.SelectColor();
}

@When("^Select Quantity$")
public void select_Quantity() throws Throwable {
	CartDownPageActionobj.ShirtQuantity();
}

@Then("^Add to shopping cart$")
public void add_to_shopping_cart() throws Throwable {
	CartDownPageActionobj.AddtoCart();
}


}
