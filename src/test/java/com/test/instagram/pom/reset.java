package com.test.instagram.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.instagram.base.base;

public class reset {

	private WebDriver driver;

	@FindBy(xpath = "(//div[contains(text(),'Not now')])")
	@CacheLookup
	public WebElement save_button;

	@FindBy(xpath = "//span[contains(text(),'More')]")
	@CacheLookup
	public WebElement more_button;

	@FindBy(xpath = "//span[contains(text(),'Settings')]") 
	@CacheLookup
	public WebElement setting_button;

	@FindBy(xpath = "//span[contains(text(),'Content preferences')]")
	@CacheLookup
	public WebElement Content_button;

	@FindBy(xpath = "//span[contains(text(),'Sensitive content')]")
	@CacheLookup
	public WebElement senstive_button;

	@FindBy(id = "IGDSRadioButtonChoose how much sensitive content to see:2")
	@CacheLookup
	public WebElement less_radio;
	@FindBy(xpath = "//button[contains(text(),'Confirm')]")
	@CacheLookup
	public WebElement confirm_button;
	
	@FindBy(xpath="(//div[@class='x1n2onr6'])[16]")
	@CacheLookup
	public WebElement two_more_button;

	@FindBy(xpath = "//span[contains(text(),'Log out')]")
	@CacheLookup
	public WebElement logout;

	public reset() throws InterruptedException {
		this.driver = base.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void savebutton() {
		save_button.click();
	}

	public void morebutton() {
		more_button.click();
	}

	public void settingbutton() {
		setting_button.click();
	}

	public void contentbutton() {
		Content_button.click();

	}

	public void senstivebutton() {
		senstive_button.click();
	}

	public void lessradio() {
		less_radio.click();

	}

	public void confirmbutton() {
		confirm_button.click();

	}
	public void twomorebutton() {
		two_more_button.click();
	}

	public void logout() {
		logout.click();
	}

}
