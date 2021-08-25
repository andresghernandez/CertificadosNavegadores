package com.certificados.utils;

import org.openqa.selenium.WebDriver;
import static com.certificados.models.BrowserValidation.*;
import net.thucydides.core.webdriver.DriverSource;

public class SelectTypeDriver implements DriverSource {

	MyEdgeDriver myEdgeDriver = new MyEdgeDriver();
	MyDriverChrome myDriverChrome = new MyDriverChrome();
	MyFirefoxDriver myFirefoxDriver = new MyFirefoxDriver();

	@Override
	public WebDriver newDriver() {
		WebDriver driver = null;
		String nameBrowser = getBrowser().toLowerCase();
		switch (nameBrowser) {
		case "chrome":
			driver = myDriverChrome.webChromeDriver();
			break;
		case "firefox":
			driver = myFirefoxDriver.webFirefoxDriver();
			break; 
		case "edge":
			driver = myEdgeDriver.webEdgeDriver();
			break;
		default:
			
		}
		return driver;
		//return myEdgeDriver.webEdgeDriver();
		//return myDriverChrome.webChromeDriver();
		//return myFirefoxDriver.webFirefoxDriver();
	}

	@Override
	public boolean takesScreenshots() {
		return true;
	}
	
}
