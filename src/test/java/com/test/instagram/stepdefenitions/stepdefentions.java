package com.test.instagram.stepdefenitions;



import com.test.instagaram.action.action;
import com.test.instagram.pom.login_page;
import com.test.instagram.pom.reset;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepdefentions extends action {

	login_page login_Page;
	reset reset;

	public stepdefentions() throws InterruptedException {
		login_Page = new login_page();
		reset = new reset();
	}

	@Given("User enter the username")
	public void user_enter_the_username() {
		action.click(login_page.usernametx);
		action.sendkeysUsingActions(login_page.usernametx, "____praveen__kumar____");

	}

	@Given("user enter the password")
	public void user_enter_the_password() {
		action.click(login_page.passtc);
		action.sendkeysUsingActions(login_page.passtc, "Pr@v3698");
	}

	@Then("user click on the login button")
	public void user_click_on_the_login_button() {
		action.click(login_page.login);

	}

	@Given("Click on the save login info")
	public void click_on_the_save_login_info() {
	action.click(reset.save_button);
	}

	@Then("Click on the more button")
	public void click_on_the_more_button() {
		action.click(reset.more_button);
	}

	@Then("Click on the setting  button")
	public void click_on_the_setting_button() {
		action.click(reset.setting_button);
	}

	@Then("click on the content perferance button")
	public void click_on_the_content_perferance_button() {
		action.click(reset.Content_button);
	}

	@Then("Click on the sensetive Content button")
	public void click_on_the_sensetive_content_button() {
		action.click(reset.senstive_button);

	}

	@Then("Click on the Less radio button")
	public void click_on_the_less_radio_button() {
		action.click(reset.less_radio);

	}

	@Then("Click on the Save button")
	public void click_on_the_save_button() {
		action.click(reset.confirm_button);

	}

	@Then("Logout Instagram")
	public void logout_instagram() throws InterruptedException {
		action.click(reset.two_more_button);
		Thread.sleep(1000);
		
		action.click(reset.logout);

	}

}
