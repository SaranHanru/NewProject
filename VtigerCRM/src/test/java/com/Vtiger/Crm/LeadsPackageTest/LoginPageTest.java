package com.Vtiger.Crm.LeadsPackageTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Vtiger.Base.BaseClass;
import com.Vtiger.GenericLibraries.WebDriverUtilityVtigerCRM;

public class LoginPageTest extends BaseClass{

	WebDriverUtilityVtigerCRM util=new WebDriverUtilityVtigerCRM();
	@Test
	public void SignInVtiger() {
		driver.findElement(By.xpath("//a[text()='Calendar']")).click();
		util.navigateBack(driver);
	}
}
