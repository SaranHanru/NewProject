package com.Vtiger.pomRepoLibraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.GenericLibraries.WebDriverUtilityVtigerCRM;

public class LogOutPage extends WebDriverUtilityVtigerCRM {
   WebDriver driver;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement imgBtn;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOutBtn;
	
	public LogOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void SignOutCrm(WebDriver driver) {
		LogOutPage logout= new LogOutPage(driver);
		WebDriverUtilityVtigerCRM util=new WebDriverUtilityVtigerCRM();
		util.mouseHover(driver, imgBtn);
        logout.imgBtn.click();
        logout.signOutBtn.click();
	}
	
	/*public void SignOutCrm() {
		//imgBtn.click();
		WebDriverUtilityVtigerCRM util=new WebDriverUtilityVtigerCRM();
		util.mouseHover(driver,imgBtn);
		signOutBtn.click();	
		}*/
	
	
}
