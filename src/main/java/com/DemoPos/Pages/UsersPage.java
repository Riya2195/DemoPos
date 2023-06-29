package com.DemoPos.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.DemoPos.Utilities.PageUtilities;
import com.DemoPos.Utilities.RandomUtilities;
import com.DemoPos.Utilities.WaitUtilities;

public class UsersPage {
	public WebDriver driver;

	@FindBy(xpath = "//*[contains(text(),'User Management')]")
	WebElement userManagement;

	@FindBy(xpath = "//*[contains(text(),'Users')]")
	WebElement users;

	@FindBy(xpath = "//div[@class='dataTables_info' and @id='users_table_info']")
	WebElement totalPage;

	@FindBy(xpath = "//a[@class='btn btn-block btn-primary']")
	WebElement add;

	@FindBy(id = "first_name")
	WebElement firstName;

	@FindBy(id = "email")
	WebElement emailElement;

	@FindBy(id = "password")
	WebElement passwordElement;

	@FindBy(id = "confirm_password")
	WebElement passwordElement2;

	@FindBy(id = "submit_user_button")
	WebElement saveBtn;

	@FindBy(id = "role")
	WebElement roleDrp;

	@FindBy(xpath = "//h1[contains(text(),'Add user')]")
	WebElement addUser;
	
	@FindBy(id = "toast-container")
	WebElement addMsg;
	
	public UsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public String userAddMessage() {
		String message = addMsg.getText();
		return message;
	}

	public boolean enterFirstName(String firstName2, String email2, String testPassword2, int role2) {
		userManagement.click();
		WaitUtilities.waitForElementToBeClickable(driver, users);
		users.click();
		totalPage.click();
		WaitUtilities.waitForElementToBeClickable(driver, add);
		add.click();
		firstName.sendKeys(firstName2);
		emailElement.sendKeys(email2);
		PageUtilities.selectClassDropdown(roleDrp, role2);

		passwordElement.sendKeys(testPassword2);
		passwordElement2.sendKeys(testPassword2);
		saveBtn.click();
		return true;

	}

}
