package com.test.instagram.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.instagram.base.base;

public class login_page {

	 private WebDriver driver;
	@FindBy(name = "username")
	@CacheLookup
	public static WebElement usernametx;
	@FindBy(name = "password")
	@CacheLookup
	public static WebElement passtc;
	@FindBy(xpath = "(//div[contains(text(),'Log in')])[1]")
	@CacheLookup
	public static WebElement login;

	public login_page() throws InterruptedException {
		 this.driver = base.getDriver(); 
	        PageFactory.initElements(driver, this);
	}

	public void username(String name) {
		usernametx.sendKeys(name);

	}

	public void password(String password) {
		passtc.sendKeys(password);
	}

	public void login() {
		login.click();

	}

}
