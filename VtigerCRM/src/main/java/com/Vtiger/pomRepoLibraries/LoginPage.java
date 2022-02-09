package com.Vtiger.pomRepoLibraries;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.GenericLibraries.PropertyFileUtilityVtigerCRM;

public class LoginPage {
	WebDriver driver;
	
	PropertyFileUtilityVtigerCRM p= new PropertyFileUtilityVtigerCRM();

	@FindBy(name="user_name")
	private WebElement userNameTb;
	
	@FindBy(name ="user_password")
	private WebElement passWordTb;
	
	@FindBy(id="submitButton")
	private WebElement loginBtn;
	
	/*private WebElement suma;

	public WebElement getSuma() {
		return suma;
	}
*/
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUserNameTb() {
		return userNameTb;
	}
	
	/*public void LoginVtiger(String username, String password) {
		LoginPage lp=new LoginPage(driver);
		lp.userNameTb.sendKeys(username);
		lp.passWordTb.sendKeys(password);
		lp.loginBtn.click();
		
	}*/
	
	public void login() throws IOException {
		
		userNameTb.sendKeys(p.readFromPropUtil("username"));
		passWordTb.sendKeys(p.readFromPropUtil("password"));
		loginBtn.click();
	}

	
}
