package com.Vtiger.Crm.LeadsPackageTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.Vtiger.GenericLibraries.PropertyFileUtilityVtigerCRM;
import com.Vtiger.GenericLibraries.WebDriverUtilityVtigerCRM;

public class Summa {
PropertyFileUtilityVtigerCRM pdata=new PropertyFileUtilityVtigerCRM();
WebDriverUtilityVtigerCRM Utils=new WebDriverUtilityVtigerCRM(); 
	@Test
	public void login() throws IOException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get(pdata.readFromPropUtil("URL"));
		Utils.implicit(driver);
		driver.quit();
	}
}

