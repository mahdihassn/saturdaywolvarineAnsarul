package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import upskill.ebay.pageAction.EbaySearchResultActions;

public class EbaySearchResultSteps {
	
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	
	@Then("^Item list should have only shoes related products$")
	public void item_list_should_have_only_shoes_related_products() throws Throwable {
		Thread.sleep(5000);
		EbaySearchResultActionsObj.verifyShoesItems();
		Thread.sleep(3000);
	}

}
