package com.test.instagram.hooks;

import org.openqa.selenium.WebDriver;

import com.test.instagram.base.base;

import io.cucumber.java.After;

import io.cucumber.java.Before;

public class hooks {
	private WebDriver driver;

	@Before
	public void setUp() throws InterruptedException {
		driver = base.getDriver(); // ✅ Assign WebDriver instance
		System.out.println("Driver initialized in Hooks: " + driver);
	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit(); // ✅ Quit only if initialized
			driver = null; // ✅ Prevent multiple instances
		}
	}
}
