package com.nop.launch;

import static com.project.services.XPathConstants.*;

import org.testng.annotations.Test;

import com.project.services.MyUtil;


public class Products extends LaunchSite {
	
	
	@Test
	public void products() {
		nonIndustries();
		industries();
	}
	
	public void nonIndustries() {
		MyUtil.mouseHoverAndClick(PRODUCTS, STORE_DEMO);
		MyUtil.mouseHoverAndClick(PRODUCTS, SHOW_CASE);
		MyUtil.mouseHoverAndClick(PRODUCTS, FEATURES);
		MyUtil.mouseHoverAndClick(PRODUCTS, WHY_FOR_DEVELOPERS);
		
	}
	
	public void industries() {
		MyUtil.mouseHoverAndHoverAndClick(PRODUCTS,INDUSTRIES, FASHION);
		MyUtil.mouseHoverAndHoverAndClick(PRODUCTS,INDUSTRIES, HEALTH_BEAUTY);
		MyUtil.mouseHoverAndHoverAndClick(PRODUCTS,INDUSTRIES, FOOD_AND_BEVERAGE);
		MyUtil.mouseHoverAndHoverAndClick(PRODUCTS,INDUSTRIES, AUTOMOTIVE);
		MyUtil.mouseHoverAndHoverAndClick(PRODUCTS,INDUSTRIES, INDUSTRIAL_SCIENTIFIC);
		MyUtil.mouseHoverAndHoverAndClick(PRODUCTS,INDUSTRIES, FURNITURE);
		MyUtil.mouseHoverAndHoverAndClick(PRODUCTS,INDUSTRIES, B2B_eCOMMERCE);
		MyUtil.mouseHoverAndHoverAndClick(PRODUCTS,INDUSTRIES, INTERNATIONAL);
		
	}
	
}
