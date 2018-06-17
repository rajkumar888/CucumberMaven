package cucumberTutorial.stepDefinitions.demo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoStepDefinitions {
	
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Exception {
	
	}

	@Given("^some other precondition$")
	public void some_other_precondition() throws Exception {
	    
	}

	@When("^I complete action$")
	public void i_complete_action() throws Exception {
	    
	}

	@When("^some other action$")
	public void some_other_action() throws Exception {
	  
	}

	@When("^yet another action$")
	public void yet_another_action() throws Exception {
	   
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Exception {
	 
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Exception {
	 
	}

	@Given("^I want to write a step with name(\\d+)$")
	public void i_want_to_write_a_step_with_name(int arg1) throws Exception {
	    
	}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) throws Exception {
	    
	}

	@Then("^I verify the success in step$")
	public void i_verify_the_success_in_step() throws Exception {
	  
	}

	@Then("^I verify the Fail in step$")
	public void i_verify_the_Fail_in_step() throws Exception {
	 
	}



}
