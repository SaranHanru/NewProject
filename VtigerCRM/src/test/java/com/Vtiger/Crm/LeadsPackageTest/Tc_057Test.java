package com.Vtiger.Crm.LeadsPackageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Vtiger.Base.BaseClass;
import com.Vtiger.GenericLibraries.WebDriverUtilityVtigerCRM;
import com.Vtiger.pomRepoLibraries.HomePage;
import com.Vtiger.pomRepoLibraries.LeadsPage;

public class Tc_057Test extends BaseClass{

	@Test
	public void leadsLoginTest() {
		HomePage hp=new HomePage(driver);
		hp.homePageCrm();
		LeadsPage lp=new LeadsPage(driver);
		lp.getCreateLeadBtn().click();
		lp.getFirstNameTab().sendKeys("Fuzail");
		lp.getLastNameTab().sendKeys("Rashid");
		lp.getCompanyTab().sendKeys("Google");
		lp.getSaveBtn().click();
		WebElement webText = driver.findElement(By.xpath("//span[contains(text(),'LEA')]"));
		String strText = webText.getText();
		String[] splitStr = strText.split(" ");
		System.out.println(splitStr[1]);
		hp.homePageCrm();
		WebElement ele=driver.findElement(By.xpath("//table//tbody//tr//td[text()='"+ splitStr[1] +" ']/following::a[1]"));
	    ele.click();
	    lp.getDeleteBtn().click();
	    WebDriverUtilityVtigerCRM utils=new WebDriverUtilityVtigerCRM();
		utils.alertPopUpOk(driver);	    
		}
}


//    '//*[@id="selectCurrentPageRec"]'//tr