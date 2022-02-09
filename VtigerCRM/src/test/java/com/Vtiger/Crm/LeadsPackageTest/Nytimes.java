package com.Vtiger.Crm.LeadsPackageTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nytimes {
	
	@Test
	public void nytimes() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nytimes.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement fontColor = driver.findElement(By.cssSelector("a[aria-label='The New York Times'] svg[viewBox='0 0 184 25']"));
		System.out.println(fontColor.getAttribute("fill"));
		driver.findElement(By.cssSelector("div[class='css-jj4aw3'] li[class='css-cwdrld'] a[href='/section/sports']")).click();
		
	}

}
