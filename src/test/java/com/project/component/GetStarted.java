package com.project.component;

import static com.project.services.XPathConstants.*;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.project.services.MyUtil;


public class GetStarted extends LaunchSite {
	
	
	@Test
	public void GetStarted() {
		chromeBrowser.findElement(By.xpath(GET_STARTED)).click();
		chromeBrowser.findElement(By.xpath(Premium_Support_Services)).click();
		chromeBrowser.navigate().back();
		chromeBrowser.findElement(By.xpath(Documentation)).click();
		
		ArrayList<String> newTb = new ArrayList<String>(chromeBrowser.getWindowHandles());
		chromeBrowser.switchTo().window(newTb.get(1));
		System.out.println("Page title of new tab: " + chromeBrowser.getTitle());
		chromeBrowser.findElement(By.xpath(PRE_INSTALLED)).click();
		chromeBrowser.findElement(By.xpath(HOSTING)).click();
		chromeBrowser.findElement(By.xpath(FREE30DAYS)).click();
		chromeBrowser.navigate().back();
		chromeBrowser.navigate().back();
		clicking("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/span[1]",1);
		clicking("//a[@title='Installation & upgrading']",2);
		clicking("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]", 1);
		clicking("//a[@title='Getting started']",2);
		chromeBrowser.findElement(By.xpath(LOGO)).click();
		chromeBrowser.findElement(By.xpath(BUTTON)).click();
		chromeBrowser.findElement(By.xpath(REQUEST_QUOTE)).click();
		
		//SENDING KEYS FOR REQUEST QUOTE//
		
		chromeBrowser.findElement(By.xpath("//input[@id='ContactName']")).sendKeys("Deepika");
		chromeBrowser.findElement(By.xpath("//input[@id='CompanyName']")).sendKeys("ULFA");
		chromeBrowser.findElement(By.xpath("//input[@id='Email']")).sendKeys("dd@gmail.com");
		chromeBrowser.findElement(By.xpath("//select[@id='CountryId']")).sendKeys("Iceland");
		chromeBrowser.findElement(By.xpath("//input[@id='Timeframe']")).sendKeys("2 months");
		chromeBrowser.findElement(By.xpath("//input[@id='Budget']")).sendKeys("200000");
		chromeBrowser.findElement(By.xpath("//textarea[@id='ProjectDescription']")).sendKeys("Testing Website");	
	

	}
	
	public void clicking(String xPath, int number) {
		try {
			System.out.println(number);
			myUtil.justWait(xPath,  30);
			chromeBrowser.findElement(By.xpath(xPath)).click();
			
		} catch (Exception exp) {
			
			exp.printStackTrace();
		}
	}

}
