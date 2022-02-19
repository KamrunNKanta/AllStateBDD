package com.AllState.qa.bdd.steps;

import com.AllState.qa.bdd.setup.BaseClass;
import com.AllState.qa.bdd.utilities.ConsoleLogger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PayBillSteps extends BaseClass {

	@Given("user move cursor to Pay a Bill")
	public void user_move_cursor_to_pay_a_bill() {
		commonMethods.click(mainPage.payBill);
		ConsoleLogger.log("this is When click the pay a bill");
	}

	@When("user will choose PhoneNumber")
	public void user_will_choose_phone_number() {
		commonMethods.dropDownSelectByValue(mainPage.selectPhoneNumber, "Phone Number");
		ConsoleLogger.log("this is When select the dropdown phone number");
	}

	@Then("user will provide a phone number")
	public void user_will_provide_a_phone_number() {
		commonMethods.enterText(mainPage.phoneNumberInput, "7173509026");
		ConsoleLogger.log("This is When user provide phone number");
	}

	@Then("user will provide birth date")
	public void user_will_provide_birth_date() {
		commonMethods.enterText(mainPage.dateBirth, "10091989");
		ConsoleLogger.log("this is When user provide birthdate");
	}

	@Then("user will click pay now")
	public void user_will_click_pay_now() {
		commonMethods.click(mainPage.payNow);
		ConsoleLogger.log("this is When user click paynow");
	}

}
