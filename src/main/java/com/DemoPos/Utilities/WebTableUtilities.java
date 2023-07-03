package com.DemoPos.Utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTableUtilities {
	public static boolean webTableHandleSearchElement(List<WebElement> rawlist, List<WebElement> columnList,
			String tagNameValue, String checkValue) {
		boolean verifyElement = false;
		for (int i = 0; i < rawlist.size(); i++) {
			List<WebElement> currentraw = rawlist.get(i).findElements(By.tagName(tagNameValue));
			for (int j = 0; j < columnList.size(); j++) {
				String tableValue = currentraw.get(j).getText();

				if (tableValue.equals(checkValue)) {
					verifyElement = true;

					break;
				}
			}
		}
		return verifyElement;
	}
	public static boolean webTableHandleDeleteElement(List<WebElement> rawlist, List<WebElement> columnList,
			String tagNameValue, String checkValue) {
		boolean verifyElement = false;
		for (int i = 0; i < rawlist.size(); i++) {
			List<WebElement> currentraw = rawlist.get(i).findElements(By.tagName(tagNameValue));
			for (int j = 0; j < columnList.size(); j++) {
				String tableValue = currentraw.get(j).getText();

				if (tableValue.equals(checkValue)) {
					System.out.print(tableValue);
					verifyElement = true;
					break;
				}
			}
		}
		return verifyElement;
	}
	
}
