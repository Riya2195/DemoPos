package com.DemoPos.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DemoPos.Utilities.PageUtilities;
import com.DemoPos.Utilities.WaitUtilities;

public class RolesPage {
	  public WebDriver driver;

	@FindBy(xpath = "//span[contains(text(),'Roles')]")
    WebElement roles;

	  @FindBy(xpath="//a[@class='btn btn-block btn-primary']")
	  WebElement add;
	  
	  @FindBy(xpath="//label[@class='hover']")
	  WebElement selectAllChkBox;
	  
	  public RolesPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	  
	  public void moveToRole()
	  {
		  PageUtilities obj=new PageUtilities();
		  obj.moveToElement(driver, roles);
		  roles.click();
		  
		  }
	  
	  public void clickAdd()
	  {
		  WaitUtilities.waitForElementToBeClickable(driver, add);
		  add.click();
		  }
	  
	  public void  clickUserSelectAll()
	  {

		  selectAllChkBox.click();
		
		  }
	  
	
	

}
