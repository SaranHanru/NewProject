package com.Vtiger.Base;

import java.io.IOException;
//import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.Vtiger.GenericLibraries.PropertyFileUtilityVtigerCRM;
import com.Vtiger.GenericLibraries.WebDriverUtilityVtigerCRM;
import com.Vtiger.pomRepoLibraries.LogOutPage;
import com.Vtiger.pomRepoLibraries.LoginPage;

public class BaseClass extends WebDriverUtilityVtigerCRM {

	public WebDriver driver;
	public static WebDriver statdriver;
	//Properties pdata=new Properties();
	public PropertyFileUtilityVtigerCRM pdata = new PropertyFileUtilityVtigerCRM();
	public WebDriverUtilityVtigerCRM Utils = new WebDriverUtilityVtigerCRM();

	/*@BeforeClass
	public void launchBrowser() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url = pdata.readFromPropUtil("URL");
		driver.get(url);
		Utils.implicit(driver);	 
	}*/
	
	@BeforeClass
	public void launchBrowser() throws IOException {
	    	String browser = pdata.readFromPropUtil("browser");
	    	if(browser.equalsIgnoreCase("chrome")) {
	    		driver=new ChromeDriver();
	    	}
	    	else if(browser.equalsIgnoreCase("firefox")) {
	    		driver=new FirefoxDriver();
	    	}
	    	driver.manage().window().maximize();
	    	Utils.implicit(driver);
	    	statdriver=driver;
	    	
	    	String url = pdata.readFromPropUtil("URL");
	    	driver.get(url);
	    	Utils.implicit(driver);
	}
	
	@BeforeMethod
	public void loginVtiger() throws IOException, InterruptedException {
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(5000);
		lp.login();
	}

	@AfterMethod
	public void SignOutVtiger() throws InterruptedException {
		LogOutPage l = new LogOutPage(driver);
		Thread.sleep(5000);
		l.SignOutCrm(driver);
		Thread.sleep(5000);
	}

	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
