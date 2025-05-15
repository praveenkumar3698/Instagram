package com.test.instagram.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	  private static WebDriver driver;
	    private static final String browserName = "chrome";  
	    // Singleton pattern for WebDriver
	    public static WebDriver getDriver() {
	        if (driver == null) {
	            initializeDriver();
	        }
	        return driver;
	    }

	    private static void initializeDriver() {
	        System.out.println("Initializing WebDriver...");
	        if (browserName.equalsIgnoreCase("chrome")) {
	            WebDriverManager.chromedriver().setup();
	            ChromeOptions options = new ChromeOptions();
	            driver = new ChromeDriver(options);
	        } else if (browserName.equalsIgnoreCase("firefox")) {
	            WebDriverManager.firefoxdriver().setup();
	            driver = new FirefoxDriver();
	        } else {
	            throw new IllegalArgumentException("Unsupported browser: " + browserName);
	        }

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	        driver.get("https://www.instagram.com/");
	    }

	    public static void quitDriver() {
	        if (driver != null) {
	            driver.quit();
	            driver = null;  // Reset driver after quitting
	        }
	    }
	}