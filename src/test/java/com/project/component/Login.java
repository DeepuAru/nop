package com.project.component;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.project.services.XPathConstants.*;

public class Login extends LaunchSite{
	@Test
	
	public void login() throws Exception{
		myUtil.mouseHoverAndClick("//span[@class='user-actions-ico']//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]", "//span[normalize-space()='Log in']");
}
}
