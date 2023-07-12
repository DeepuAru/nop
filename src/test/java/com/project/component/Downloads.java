package com.project.component;

import org.testng.annotations.Test;
import static com.project.services.XPathConstants.*;

public class Downloads extends LaunchSite{
	@Test
	
	public void downloads() throws Exception{
		
		myUtil.mouseHoverAndClick(DOWNLOADS,DOWNLOAD_NOP_COM);
		myUtil.mouseHoverAndClick(DOWNLOADS,MARKET_PLACE);
		myUtil.mouseHoverAndClick(DOWNLOADS,TRANSLATIONS);
		myUtil.mouseHoverAndClick(DOWNLOADS,COPYRIGHT);
		myUtil.mouseHoverAndClick(DOWNLOADS,MOBILE_APP);
		myUtil.mouseHoverAndClick(DOWNLOADS,WEB_API);
	
	}

}
