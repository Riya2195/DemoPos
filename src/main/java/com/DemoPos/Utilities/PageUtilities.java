package com.DemoPos.Utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtilities {
	public Alert waitForAlert(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		return alert;
	}
	public static void hitenter (WebDriver driver, WebElement element)
	{
		element.sendKeys(Keys.ENTER);
	}
	public void sendTestUsingMouseActions(WebDriver driver, WebElement element, String text)
	{
		Actions action=new Actions(driver);
		action.sendKeys(element,text).build().perform();		
	}
	public void moveToElement(WebDriver driver, WebElement element)
    {
    	Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();	
    }

public static Select selectClassDropdown(WebElement element) {////add 
	Select obj=new Select(element);
	return obj;
	}

public static void  scrollWindow(WebDriver driver,WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView()",element);
}

public static void  scrollUp(WebDriver driver) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
}


public static void webtableHandle(WebDriver driver,List<WebElement> element1,List<WebElement> element2)//correct
{
	int r=element1.size();
	int c=element2.size();
	for(int i=0;i<r;i++) {
		List<WebElement> currentraw=element1.get(i).findElements(By.tagName("td"));
		
		for(int j=0;j<c;j++) {
			String s=currentraw.get(j).getText();
					System.out.print(s);
		}
		System.out.println();
		System.out.println("-----------------------------------------");

	}
}


public static void webtableHandleCheckItem(WebDriver driver,List<WebElement> element1,List<WebElement> element2)
{
	int r=element1.size();
	int c=element2.size();
	for(int i=0;i<r;i++) {
		List<WebElement> currentraw=element1.get(i).findElements(By.tagName("td"));
		if(currentraw.get(i).getText().equalsIgnoreCase("Pen"))
		{
		for(int j=0;j<c;j++) {
			String s=currentraw.get(j).getText();
					System.out.print(s);
		}
		System.out.println();
		System.out.println("-----------------------------------------");
}
		break;
	}
}
}




