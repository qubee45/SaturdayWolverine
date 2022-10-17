package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.SheetyHomepageAction;

public class SheetyHomepagestepDef {
	
	SheetyHomepageAction SheetyHomepageActionObj = new SheetyHomepageAction();

@Given("^Open Shetty Homepage$")
public void open_Shetty_Homepage() throws Throwable {
	SheetyHomepageActionObj.loadSheetyHomepage();
}

@When("^Click on iframe Home$")
public void click_on_iframe_Home() throws Throwable {
	SheetyHomepageActionObj.switchShettyIframe();
	SheetyHomepageActionObj.click();
 
}
@Then("^It should reload iframe homepage$")
public void it_should_reload_iframe_homepage() throws Throwable {
	SheetyHomepageActionObj.verifyShetty();

}
}