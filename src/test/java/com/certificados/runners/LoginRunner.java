package com.certificados.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/Login.feature",
		glue = "com.certificados.stepsdefinitions",
		snippets = SnippetType.CAMELCASE,
		tags = {""})
public class LoginRunner {

}