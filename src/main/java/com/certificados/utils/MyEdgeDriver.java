package com.certificados.utils;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class MyEdgeDriver {

	private Logger log = LoggerFactory.getLogger(MyEdgeDriver.class);
	WebDriver driver = null;
	
	public WebDriver webEdgeDriver() {
		try {
			System.setProperty("webdriver.edge.driver", "src\\test\\resources\\drivers\\msedgedriver.exe");
			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.setCapability("acceptInsecureCerts", true);
			driver = new EdgeDriver(edgeOptions);
			driver.manage().window().maximize();
			return driver;
		} catch (Exception e) {
			log.warn("Falló al crear driver Edge.");
		}
		return null;
	}
	
}
