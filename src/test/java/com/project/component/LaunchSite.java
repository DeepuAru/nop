package com.project.component;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Test;

	import com.project.services.MyUtil;
	import com.project.services.XPathConstants;

	import io.github.bonigarcia.wdm.WebDriverManager;
	import static com.project.services.XPathConstants.*;
	/* 
	  IMPORT STATIC IS A NEW METHOD IN JAVA WHICH HELPS US IN
	  DIRECTLY CALLING THE FUNCTION WITH OUT CLASS NAME...
	 */
	public class LaunchSite {
		
		public static WebDriver chromeBrowser=null;
		public static MyUtil myUtil = null;
		private static String url = SITE_URL;
		
		@BeforeSuite
		public void openBrowser() {
			try 
			{
				WebDriverManager.chromedriver().setup();
				chromeBrowser = new ChromeDriver();
				chromeBrowser.manage().window().maximize();
				chromeBrowser.get(url);
			
				myUtil = new MyUtil(chromeBrowser);
				
				launchTesting();
			} catch (Exception exp) {
				exp.printStackTrace();
			}
		}
		
		public void launchTesting() throws Exception {
			WebDriverWait wait = new WebDriverWait(chromeBrowser, 10);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Products']")));
			((JavascriptExecutor)chromeBrowser).executeScript("arguments[0].click();", element);
		}
	}

