package com.certificados.models;

public class BrowserValidation {

	private BrowserValidation() {}

	private static String browser;

	public static String getBrowser() {
		return browser;
	}

	public static void setBrowser(String browser) {
		BrowserValidation.browser = browser;
	}

}
