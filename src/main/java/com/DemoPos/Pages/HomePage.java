package com.DemoPos.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DemoPos.Utilities.PageUtilities;

public class HomePage {
	
		  public WebDriver driver;
		  
		  @FindBy(xpath="//*[@id=\"stock_alert_table\"]/thead/tr/th[1]")
		  WebElement product;
		  
		  @FindBy(xpath="//*[@id=\"stock_alert_table\"]/thead/tr/th")
		  List<WebElement> columnPrdStockAlert;
		  
		  @FindBy(xpath="//*[@id=\"stock_alert_table\"]/tbody/tr")
		  List<WebElement> rawPrdStockAlert;
		  
		  
		  public HomePage(WebDriver driver) {
				this.driver = driver;
				PageFactory.initElements(driver, this);
			}
		  
		  public boolean verifyScrollParticularElement()
		  {
			  PageUtilities.scrollWindow(driver, product);
			  return true;
		  }
		 
		  public boolean ProductStockAlertlist()
		  {
			 
			  PageUtilities.webtableHandle(driver, rawPrdStockAlert, columnPrdStockAlert);
			  return true;
		  }
}
		  
		 
		  



