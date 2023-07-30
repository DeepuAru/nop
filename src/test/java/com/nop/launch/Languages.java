package com.nop.launch;

import static com.project.services.XPathConstants.*;

import org.testng.annotations.Test;

import com.project.services.MyUtil;

public class Languages {
	
	@Test
	public void language() {
		MyUtil.mouseHoverAndClick(LANGUAGES, ENGLISH);
		MyUtil.mouseHoverAndClick(LANGUAGES, SPAINISH);
		MyUtil.mouseHoverAndClick(LANGUAGES, DUTCH);
		MyUtil.mouseHoverAndClick(LANGUAGES, RUSSIAN);
		MyUtil.mouseHoverAndClick(LANGUAGES, FRANCE);
		MyUtil.mouseHoverAndClick(LANGUAGES, ITALIAN);
		MyUtil.mouseHoverAndClick(LANGUAGES, PORTUGAL);
		MyUtil.mouseHoverAndClick(LANGUAGES, TURKEY);
		MyUtil.mouseHoverAndClick(LANGUAGES, CHINESE);
		MyUtil.mouseHoverAndClick(LANGUAGES, FRENCH);
		MyUtil.mouseHoverAndClick(LANGUAGES, DIFF_LANG);
		
		
	}

}
