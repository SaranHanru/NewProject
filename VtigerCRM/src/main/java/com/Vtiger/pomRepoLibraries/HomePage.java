package com.Vtiger.pomRepoLibraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    
	WebDriver driver;
	
	@FindBy(xpath="//img[@src='themes/softed/images/Home.PNG']")
	private WebElement homeBtn;
	
	@FindBy(xpath="//a[text()='Calendar']")
	private WebElement calendarBtn;
	
	@FindBy(xpath="//a[text()='Leads']")
	private WebElement leadsBtn;
	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement orgBtn;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactBtn;
	
	@FindBy(xpath="//a[text()='Opportunities']")
	private WebElement oppBtn;
	
	@FindBy(xpath="//a[text()='Products']")
	private WebElement productBtn;
	
	@FindBy(xpath="//a[text()='Documents']")
	private WebElement docBtn;
	
	@FindBy(xpath="//a[text()='Email']")
	private WebElement emailBtn;
	
	@FindBy(xpath="//a[text()='Trouble Tickets']")
	private WebElement ticketBtn;
	
	@FindBy(xpath="//a[text()='Dashboard']")
	private WebElement dashBtn;
	
	@FindBy(xpath="//a[text()='More']")
	private WebElement moreBtn;
	
	@FindBy(id="qccombo")
	private WebElement optionBtn;
	
	@FindBy(xpath="//img[@title='Open Calendar...']")
	private WebElement openCalBtn;
	
	@FindBy(xpath="//img[@title='Show World Clock...']")
	private WebElement clockBtn;
	
	@FindBy(xpath="//img[@title='Open Calculator...']")
	private WebElement openCalciBtn;
	
	@FindBy(xpath="//img[@title='Chat...']")
	private WebElement chatBtn;
	
	@FindBy(xpath="//img[@title='Last Viewed']")
	private WebElement lastViewBtn;
	
	@FindBy(xpath="//img[@title='Change layout']")
	private WebElement layoutBtn;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/*public void title() {
		String homePageTitle = driver.getTitle();
		if(homePageTitle.equalsIgnoreCase(" Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM")) {
			System.out.println("Entered into Homepage " + homePageTitle);
		}else {
			System.out.println("Entered into wrong page " + driver.getTitle());
		}
		
	}*/
	
	public void home() {
		homeBtn.click();
	}
	public void calendar() {
		calendarBtn.click();
	}
	
	public void leads() {
		leadsBtn.click();
	}
	
	public void organization() {
		orgBtn.click();
	}
	
	public void contacts() {
		contactBtn.click();
	}
	
	public void oppurtunities() {
		oppBtn.click();
	}
	
	public void products() {
		productBtn.click();
	}
	
	public void documents() {
		docBtn.click();
	}
	
	public void email() {
		emailBtn.click();
	}
	
	public void tickets() {
		ticketBtn.click();
	}
	
	public void dashBoard() {
		dashBtn.click();
	}
	
	public void more() {
		moreBtn.click();
	}
	
	public void option() {
		optionBtn.click();
	}
	
	public void openCalendar() {
	    openCalBtn.click();	
	}
	
	public void showWorldClock() {
		clockBtn.click();
	}
	
	public void openCalculator() {
		openCalciBtn.click();
	}
	
	public void chat() {
		chatBtn.click();
	}
	
	public void lastViewd() {
		lastViewBtn.click();
	}
	
	public void changeLayout() {
		layoutBtn.click();
	}
	
	//public void homePageCrm(WebDriver driver) {
		//HomePage hpage=new HomePage(driver);
		//hpage.leadsBtn.click();
	//}
	public void homePageCrm() {
		leadsBtn.click();
	}
}
