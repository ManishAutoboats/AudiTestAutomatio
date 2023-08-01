package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	@Given("user launch site url")
	public void user_launch_site_url() {
		System.out.println("Launch URL");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("Enter detials");
	}

	@When("user click on button")
	public void user_click_on_button() {
		System.out.println("click on Button");
	}

	@Then("validate sucesfull login")
	public void validate_sucesfull_login() {
		System.out.println("validation");
	}

	@Then("Validate success message")
	public void validate_success_Message() {
		System.out.println("Sucess");
	}

	@Then("validate error message")
	public void validate_error_message() {
	    System.out.println("Error");
	}

}
