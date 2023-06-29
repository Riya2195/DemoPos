package com.DemoPos.Script;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DemoPos.Base.TestBase;
import com.DemoPos.Pages.HomePage;
import com.DemoPos.Pages.LoginPage;

public class HomeTest extends TestBase {
	HomePage objHome;


	
	@Test(priority = 5,description="Verify  the Supplier in Purchase Payment Due")
	public void verifyPurchasePaymentDueList() {
		objHome = new HomePage(driver);
		boolean assert6=objHome.purchasePaymentDueList();
		Assert.assertTrue(assert6);
	}

}
