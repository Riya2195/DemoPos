package com.DemoPos.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DemoPos.Constants.Constants;
import com.DemoPos.Utilities.PageUtilities;
import com.DemoPos.Utilities.RandomUtilities;
import com.DemoPos.Utilities.WaitUtilities;
import com.DemoPos.Utilities.WebTableUtilities;

public class RolesPage {
	public WebDriver driver;

	@FindBy(xpath = "//span[contains(text(),'Roles')]")
	WebElement roles;

	@FindBy(xpath = "//a[@class='btn btn-block btn-primary']")
	WebElement add;

	@FindBy(id = "name")
	WebElement roleName;

	@FindBy(xpath = "//div[@class='icheckbox_square-blue hover']")
	WebElement selectAllChkBox;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement roleSaveBtn;

	@FindBy(id = "toast-container")
	WebElement roleMsg;

	@FindBy(id = "//table[@id=\"roles_table\"]/tbody/tr[2]/td[1]")
	WebElement adminTest;

	@FindBy(xpath = "//table[@id=\"roles_table\"]/thead/tr/th")
	List<WebElement> roleInfo;// column

	@FindBy(xpath = "//table[@id=\"roles_table\"]/tbody/tr")
	List<WebElement> rolesElements;

	@FindBy(xpath = "//table[@id=\"roles_table\"]/tbody/tr[3]/td[2]/button")
	WebElement deleteBtn;

	@FindBy(xpath = "//div[@class=\"swal-button-container\"][2]")
	WebElement confirmDelete;

	@FindBy(id = "toast-container")
	WebElement roleMsg1;

	public RolesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String roleAddMessage() {
		String message = roleMsg.getText();
		WaitUtilities.waitForElementToBeVisible(driver, roleMsg);

		return message;
	}

	public void addNewRole() {
		PageUtilities obj = new PageUtilities();
		obj.moveToElement(driver, roles);
		roles.click();
		WaitUtilities.waitForElementToBeClickable(driver, add);
		add.click();
		RandomUtilities.getfName();
		roleName.sendKeys(RandomUtilities.getrolename());
		PageUtilities.scrollWindow(driver, roleSaveBtn);
		roleSaveBtn.click();

	}

	public boolean deleteRole() {
		deleteBtn.click();
		WaitUtilities.waitForElementToBeVisible(driver, confirmDelete);
		confirmDelete.click();
		return 	WebTableUtilities.webTableHandleDeleteElement(rolesElements,roleInfo,Constants.TAGNAME,Constants.DELETEROLE);

	}

	public String roleDeleteMessage() {
		String message = roleMsg1.getText();
		WaitUtilities.waitForElementToBeVisible(driver, roleMsg1);
		return message;
	}
}
