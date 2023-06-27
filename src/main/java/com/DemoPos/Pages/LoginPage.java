package com.DemoPos.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	@FindBy(id = "username")
	WebElement user;

	@FindBy(id = "password")
	WebElement userpassword;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;

	@FindBy(xpath = "//*[contains(text(),'Welcome admin,')]")
	WebElement welcome;
	
	@FindBy(xpath="//*[contains(text(),'These credentials do not match our records.')]")
	WebElement errorMessage;
	
	@FindBy(xpath="//*[contains(text(),'End tour')]")
	WebElement endTour;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void SetUserName(String userName) {
		user.clear();
		user.sendKeys(userName);
	}

	public void SetPassword(String password) {
		userpassword.sendKeys(password);
	}

	public void clickSignIn() {
		login.click();
	}
	
	public void clickEndTourBox() {
		
		endTour.click();
	}

	public String welcomeMessage() {
		String message = welcome.getText();
		return message;
	}
	public String errorMessage() {
		String message = errorMessage.getText();
		return message;
	}
}