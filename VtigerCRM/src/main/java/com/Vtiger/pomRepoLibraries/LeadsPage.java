package com.Vtiger.pomRepoLibraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
 
	WebDriver driver;
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createLeadBtn;
	
	@FindBy(xpath="//select[@name='salutationtype']")
	private WebElement salutationTab;
	
	@FindBy(name="firstname")
	private WebElement firstNameTab;
	
	@FindBy(name="lastname")
	private WebElement lastNameTab;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement companyTab;
	
	@FindBy(id="designation")
	private WebElement titleTab;
	
	@FindBy(xpath="//select[@name='leadsource']")
	private WebElement leadSourceTab;
	
	@FindBy(xpath="//select[@name='industry']")
	private WebElement industryTab;
	
	@FindBy(name="annualrevenue")
	private WebElement revenueTab;
	
	@FindBy(id="noofemployees")
	private WebElement empCountTab;
	
	@FindBy(id="phone")
	private WebElement phoneTab;
	
	@FindBy(id="mobile")
	private WebElement mobileTab;
	
	@FindBy(id="fax")
	private WebElement faxTab;
	
	@FindBy(id="email")
	private WebElement mailTab;
	
	@FindBy(xpath="//input[@name='website']")
	private WebElement websiteTab;
	
	@FindBy(id="secondaryemail")
	private WebElement secEmailTab;
	
	@FindBy(name="leadstatus")
	private WebElement leadStatusTab;
	
	@FindBy(name="rating")
	private WebElement ratingTab;
	
	@FindBy(name="assigned_user_id")
	private WebElement assignedUserTab;
	
	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement streetTab;
	
	@FindBy(id="code")
	private WebElement codeTab;
	
	@FindBy(id="country")
	private WebElement countryTab;
	
	@FindBy(id="pobox")
	private WebElement postBoxTab;
	
	@FindBy(id="city")
	private WebElement cityTab;
	
	@FindBy(id="state")
	private WebElement stateTab;
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement describeTab;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//input[@title='Cancel [Alt+X]']")
	private WebElement cancelBtn;
	
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement deleteBtn;
	
	


	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getCreateLeadBtn() {
		return createLeadBtn;
	}

	public WebElement getSalutationTab() {
		return salutationTab;
	}

	public WebElement getFirstNameTab() {
		return firstNameTab;
	}

	public WebElement getLastNameTab() {
		return lastNameTab;
	}

	public WebElement getCompanyTab() {
		return companyTab;
	}

	public WebElement getTitleTab() {
		return titleTab;
	}

	public WebElement getLeadSourceTab() {
		return leadSourceTab;
	}

	public WebElement getIndustryTab() {
		return industryTab;
	}

	public WebElement getRevenueTab() {
		return revenueTab;
	}

	public WebElement getEmpCountTab() {
		return empCountTab;
	}

	public WebElement getPhoneTab() {
		return phoneTab;
	}

	public WebElement getMobileTab() {
		return mobileTab;
	}

	public WebElement getFaxTab() {
		return faxTab;
	}

	public WebElement getMailTab() {
		return mailTab;
	}

	public WebElement getWebsiteTab() {
		return websiteTab;
	}

	public WebElement getSecEmailTab() {
		return secEmailTab;
	}

	public WebElement getLeadStatusTab() {
		return leadStatusTab;
	}

	public WebElement getRatingTab() {
		return ratingTab;
	}

	public WebElement getStreetTab() {
		return streetTab;
	}

	public WebElement getCodeTab() {
		return codeTab;
	}

	public WebElement getCountryTab() {
		return countryTab;
	}

	public WebElement getPostBoxTab() {
		return postBoxTab;
	}

	public WebElement getCityTab() {
		return cityTab;
	}

	public WebElement getStateTab() {
		return stateTab;
	}

	public WebElement getDescribeTab() {
		return describeTab;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}
	
	public WebElement getDeleteBtn() {
		return deleteBtn;
	}
	
	
}
