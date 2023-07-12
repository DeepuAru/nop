package com.nop.launch;

import com.project.services.MyUtil;
import static com.project.services.XPathConstants.*;

import org.testng.annotations.Test;

public class SupportAndService extends LaunchSite{
      
	@Test
	public void support() {
		MyUtil.mouseHoverAndClick(SUPPORT_AND_SERVICE, TRAINING);
		MyUtil.mouseHoverAndClick(SUPPORT_AND_SERVICE, DOCUMENTATION);
		MyUtil.mouseHoverAndClick(SUPPORT_AND_SERVICE, COMMUNITY_FORUMS);
		MyUtil.mouseHoverAndClick(SUPPORT_AND_SERVICE, PREMIUM_SUPPORT_SERVICE);
		MyUtil.mouseHoverAndClick(SUPPORT_AND_SERVICE, REQUEST_A_QUOTE);
		MyUtil.mouseHoverAndClick(SUPPORT_AND_SERVICE, CONTACT_US);
	}
	
}
