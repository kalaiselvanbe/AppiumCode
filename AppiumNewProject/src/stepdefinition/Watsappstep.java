/**
 * 
 */
package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Kalai
 *
 */
public class Watsappstep{

	@Given("^customer open the application$")
	public void customer_open_the_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("my scripts are execting");
		throw new PendingException();
	}

	@Given("^customer verifies the application header$")
	public void customer_verifies_the_application_header() throws Throwable {
		System.out.println("my scripts are execting");
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^customer selecting the new message and verifies the target page$")
	public void customer_selecting_the_new_message_and_verifies_the_target_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^customer seleting the right contact in the contact list$")
	public void customer_seleting_the_right_contact_in_the_contact_list() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	//	@Then("^customer typing the new message as \"([^\"]*)\" for the contact name \"([^\"]*)\"$")
	//	public void customer_typing_the_new_message_as_for_the_contact_name(String arg1, String arg2) throws Throwable {
	//	    // Write code here that turns the phrase above into concrete actions
	//	    throw new PendingException();
	//	}

	@Then("^Customer tabs the send button after typing the message and verifying the send message$")
	public void customer_tabs_the_send_button_after_typing_the_message_and_verifying_the_send_message() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}	




}
