package com.project.component;

import static com.project.services.XPathConstants.*;

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

		
		
		
		
	}

}
