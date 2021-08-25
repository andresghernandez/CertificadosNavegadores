package com.certificados.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyDriverChrome {

	private Logger log = LoggerFactory.getLogger(MyDriverChrome.class);
	WebDriver driver = null;

	public WebDriver webChromeDriver() {
		try {
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setAcceptInsecureCerts(true);
			driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
			return driver;
		} catch (Exception e) {
			log.warn("Fallo al crear driver chrome");
		}
		return null;
	}

}
