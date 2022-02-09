package com.Vtiger.Crm.LeadsPackageTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Vtiger.Base.BaseClass;
import com.Vtiger.GenericLibraries.ExcelUtilityVtigerCRM;
import com.Vtiger.GenericLibraries.WebDriverUtilityVtigerCRM;
import com.Vtiger.pomRepoLibraries.HomePage;
import com.Vtiger.pomRepoLibraries.LeadsPage;

public class Tc_058Test extends BaseClass  {
	String path=".\\src/main/resources\\Lead.xlsx";
	//String path=ExcelPath;
	@Test
	public void leadsLoginTest() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.homePageCrm();
		LeadsPage lp=new LeadsPage(driver);
		ExcelUtilityVtigerCRM xl=new ExcelUtilityVtigerCRM(path);
		lp.getCreateLeadBtn().click();
		lp.getFirstNameTab().sendKeys(xl.getCellData("Sheet1", 1, 0));
		lp.getLastNameTab().sendKeys(xl.getCellData("Sheet1", 1, 1));
		lp.getCompanyTab().sendKeys(xl.getCellData("Sheet1", 1, 2));
		lp.getTitleTab().sendKeys(xl.getCellData("Sheet1", 1, 3));
		lp.getRevenueTab().clear();
		lp.getRevenueTab().sendKeys(xl.getCellData("Sheet1", 1, 4));
		lp.getEmpCountTab().sendKeys(xl.getCellData("Sheet1", 1, 5));
		lp.getMailTab().sendKeys(xl.getCellData("Sheet1", 1, 6));
		lp.getPhoneTab().sendKeys(xl.getCellData("Sheet1", 1, 7));
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
