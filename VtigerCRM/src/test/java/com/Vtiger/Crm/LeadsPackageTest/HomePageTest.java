package com.Vtiger.Crm.LeadsPackageTest;

//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Vtiger.Base.BaseClass;
//import com.Vtiger.GenericLibraries.WebDriverUtilityVtigerCRM;
import com.Vtiger.pomRepoLibraries.HomePage;

public class HomePageTest extends BaseClass {
	//WebDriver driver;
	//HomePage hp=new HomePage(driver);
	//WebDriverUtilityVtigerCRM Utils=new WebDriverUtilityVtigerCRM();
	
	@Test
	public void homePageTest() {
		//hp.title();
		//Utils.implicit(driver);
		//hp.leads();
		//Utils.navigateBack(driver);
		
		HomePage h=new HomePage(driver);
		h.homePageCrm();
		h.home();
	}
}
