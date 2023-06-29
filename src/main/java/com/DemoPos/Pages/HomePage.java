package com.DemoPos.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DemoPos.Constants.Constants;
import com.DemoPos.Utilities.PageUtilities;
import com.DemoPos.Utilities.WebTableUtilities;

public class HomePage {

	public WebDriver driver;

	@FindBy(xpath = "//h3[contains(text(),'Purchase Payment Due')]")
	WebElement purchase;

	@FindBy(xpath = "//table[@id='purchase_payment_dues_table']/thead/tr/th")
	List<WebElement> purchasePaymetDueInfo;

	@FindBy(xpath = "//table[@id='purchase_payment_dues_table']/tbody/tr")
	List<WebElement> supplierList;

	@FindBy(className = "dataTables_info")
	WebElement page;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean purchasePaymentDueList() {
		PageUtilities.scrollWindow(driver, purchase);

		WebTableUtilities.webTableHandleSearchElement(supplierList, purchasePaymetDueInfo, Constants.TAGNAME,Constants.SUPPLIER);
		return true;
	}
}
