package com.DemoPos.Script;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DemoPos.Base.TestBase;
import com.DemoPos.Pages.HomePage;
import com.DemoPos.Pages.LoginPage;

public class HomeTest extends TestBase {
	HomePage objHome;

	@Test(priority = 5,description="Verify the working of scrolling")
	public void verifyScroll() {
		objHome = new HomePage(driver);
		boolean assert5=objHome.verifyScrollParticularElement();
		
		Assert.assertTrue(assert5);
    }
	
	@Test(priority = 6,description="Verify  the Produst stock alert in console")
	public void verifyPrintPdroctStockAlert() {
		objHome = new HomePage(driver);
		boolean assert6=objHome.ProductStockAlertlist();
		Assert.assertTrue(assert6);
    }
	
	
}
