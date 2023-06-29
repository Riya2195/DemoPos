package com.DemoPos.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DemoPos.Constants.Constants;
import com.DemoPos.Utilities.PageUtilities;
import com.DemoPos.Utilities.WaitUtilities;

public class ContactsPage {
	public WebDriver driver;

	@FindBy(id = "tour_step4_menu")
	WebElement contacts;

	@FindBy(xpath = "//a[contains(text(),' Import Contacts')]")
	WebElement importContacts;

	@FindBy(name = "contacts_csv")
	WebElement chooseFile;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement submit;

	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	WebElement messageText;

	@FindBy(xpath = "//a[contains(text(),' Customer Groups')]")
	WebElement customerGroups;

	@FindBy(xpath = "//button[@class='btn btn-xs btn-primary edit_customer_group_button']")
	WebElement customerAddBtn;

	@FindBy(id = "amount")
	WebElement percentage;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement update;

	@FindBy(id = "toast-container")
	WebElement success;

	public ContactsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean importContact() {

		importContacts.click();
		chooseFile.sendKeys(Constants.CONFIGPATH_EXCELREADER);
		submit.click();
		Boolean messageTxt = messageText.isDisplayed();
		return messageTxt;
	}

	public void editCostumerGroup() {
		contacts.click();
        customerGroups.click();
		customerAddBtn.click();
		percentage.clear();
		percentage.sendKeys(Constants.CALCULATEPERCENTAGE);
        update.click();

	}

	public String customerGroupUpdateMessage() {
		String message = success.getText();
		WaitUtilities.waitForElementToBeVisible(driver, success);
		return message;
	}
}
