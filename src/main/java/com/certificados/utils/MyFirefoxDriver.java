package com.certificados.utils;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class MyFirefoxDriver {

	private Logger log = LoggerFactory.getLogger(MyFirefoxDriver.class);
	WebDriver driver = null;
	
	public WebDriver webFirefoxDriver() {
		try {
			System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\drivers\\geckodriver.exe");
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setCapability("acceptInsecureCerts", true);
			driver = new FirefoxDriver(firefoxOptions);
			driver.manage().window().maximize();
			return driver;
		} catch (Exception e) {
			log.warn("Falló al crear driver Edge.");
		}
		return null;
	}
	
}
