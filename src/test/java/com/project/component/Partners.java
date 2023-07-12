package com.project.component;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.project.services.XPathConstants.*;

public class Partners extends LaunchSite{
	@Test
	
	public void partners() throws Exception{
		chromeBrowser.findElement(By.xpath(PARTNERS)).click();
		
		chromeBrowser.findElement(By.xpath(VIEW_HOSTING_PARTNERS)).click();
		chromeBrowser.navigate().back();
		chromeBrowser.findElement(By.xpath(LEARN_MORE)).click();
		chromeBrowser.findElement(By.xpath(TECHNOLOGY_PARTNERS)).click();
		chromeBrowser.findElement(By.xpath(COTRIBUTE)).click();
		chromeBrowser.findElement(By.xpath(NOP_COMM)).click();
		chromeBrowser.findElement(By.xpath(VIEW_DEMO)).click();
		
	}
	}
