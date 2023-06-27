package com.DemoPos.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.DemoPos.Utilities.PageUtilities;
import com.DemoPos.Utilities.RandomUtilities;
import com.DemoPos.Utilities.ScreenshotUtilities;
import com.DemoPos.Utilities.WaitUtilities;

public class UsersPage {
  public WebDriver driver;
  
  
  @FindBy(xpath="//*[contains(text(),'User Management')]")
  WebElement userManagement;
  
  
  @FindBy(xpath="//*[contains(text(),'Users')]")
  WebElement users;
  
  @FindBy(xpath="//a[@class='btn btn-block btn-primary']")
  WebElement add;
  
  @FindBy(id="first_name")
  WebElement firstName;

  @FindBy(id="role")
  WebElement roleDrp;

  @FindBy(xpath="//h1[contains(text(),'Add user')]")
  WebElement addUser;
  
  
  
  public UsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
  
  public boolean clickUserManagement() throws IOException {
	  userManagement.click();
	  //ScreenshotUtilities.screenshotOfElement(users);
	  WaitUtilities.waitForElementToBeClickable(driver, users);
	  users.click();
	return true;
	}
  public void clickAdd()
  {
	  WaitUtilities.waitForElementToBeClickable(driver, add);
	  add.click();
	  
	  }
  public String addUser()
  {
    String add=addUser.getText();
    return add;
  }

public boolean enterFirstName(String firstName2) {
	firstName.sendKeys(firstName2);
	boolean first=firstName.isDisplayed();
	return first;
	
}
 












public boolean selectRole(int value)
{
	//PageUtilities.selectClassDropdown(driver, roleDrp).selectByIndex(value);
	boolean role=roleDrp.isDisplayed();
	return role;
}


}
