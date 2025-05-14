package com.test.instagaram.action;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class action {
	protected static WebDriver driver;
	 // WebDriver Setter (To initialize WebDriver in another class)
    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

	public static void waitforElementVisiblity(WebElement element) {
		try {
			WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(25));
			wd.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void dropdown(WebElement element, String text) {
		try {
			waitforElementVisiblity(element);
			Select s = new Select(element);
			s.selectByVisibleText(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void click(WebElement element) {
		try {
			waitforElementVisiblity(element);
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	 public static void clickUsingActions(WebElement element) {
	        try {
	            waitforElementVisiblity(element);
	            Actions ac = new Actions(driver);
	            ac.click(element).perform();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }


	public static void mouseHoverUsingActions(WebElement element) {
		try {
			waitforElementVisiblity(element);
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void sendkeysUsingActions(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void alertpop() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void robot(WebElement element) {
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static String getCapthaText(WebElement element) {
		try {
			System.out.println("Captcha Text : " + element.getText());
			return element.getText();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	/*
	 * public static String getText(WebElement element) {
	 * System.out.println(element.getText()); return element.getText(); } public
	 * static String date() { try { SimpleDateFormat df = new
	 * SimpleDateFormat("MM/dd/YYYY"); Date dt = new Date(); String str =
	 * df.format(dt); System.out.println(str); return str; } catch (Exception e) {
	 * e.printStackTrace(); throw new RuntimeException(); } }
	 */
	
}
