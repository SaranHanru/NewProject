package com.Vtiger.GenericLibraries;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverUtilityVtigerCRM {
	
	public void implicit(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	public void waitForElementVisibility(WebDriver driver,WebElement ele) {
		WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOf(ele)).sendKeys("abc");
	}
	public void waitUntilPageLoad(WebDriver driver) {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	public void navigateBack(WebDriver driver) {
		driver.navigate().back();
	}
	
	public void navigateForward(WebDriver driver) {
		driver.navigate().forward();
	}
	
	public void refresh(WebDriver driver) {
		driver.navigate().refresh();
	}
	
	/**
	 * dropdown by visible text
	 * @param ele
	 * @param text
	 */
	public void dropDown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	/**
	 * dropdown by index
	 * @param ele2
	 * @param index
	 */
	public void dropDown(WebElement ele2,int index) {
		Select s=new Select(ele2);
		s.selectByIndex(index);
	}
	/**
	 * dropdown by value
	 * @param value
	 * @param ele1
	 */
	public void dropDown(String value,WebElement ele1) {
		Select s=new Select(ele1);
		s.selectByValue(value);
	}
	/**
	 * mousehover
	 * @param driver
	 * @param ele
	 */
	public void mouseHover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	/**
	 * right click
	 * @param driver
	 * @param ele
	 */
	public void rightClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	/**
	 * switch tabs
	 * @param driver
	 */
	public void switchTabs(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String b : child) {
			driver.switchTo().window(b);
		}
	}
	/**
	 * switch window
	 * @param driver
	 */
	public void switchWindow(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	/**
	 * switchbackwindow
	 * @param driver
	 */
	public void switchBackWindow(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	/**
	 * alertpopup
	 * @param driver
	 */
	public void alertPopUpOk(WebDriver driver) {
		Alert al=driver.switchTo().alert();
		al.accept();
	}
	/**
	 * alertpopup cancel
	 * @param driver
	 */
	public void alertPopUpCancel(WebDriver driver) {
	Alert al=driver.switchTo().alert();
	al.dismiss();
    }
	
	//public void fileDownload(WebDriver driver) throws AWTException {
		//Robot r=new Robot();
		//r.keyPress(0);
	//}
	/**
	 * Take Screenshot
	 * @param driver
	 * @throws IOException
	 */
	/*public void takeScreenShot(WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(PathFiles.PhotoPath+".png");
		FileUtils.copyFile(src, dest );
	}*/
	/**
	 * Scroll bar
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void scrollBar(WebDriver driver,int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollby("+x+","+y+")");
		}


	
	}

