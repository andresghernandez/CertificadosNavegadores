package com.certificados.stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static com.certificados.models.BrowserValidation.*;
import org.openqa.selenium.WebDriver;
import com.certificados.tasks.OpenPage;

public class LoginStepsDefinition {
		
	private Actor actor = Actor.named("the");

	@Managed
	private WebDriver hisBrowser;
	
	@Before
	public void setUp() {
		actor.can(BrowseTheWeb.with(hisBrowser));
	};
	
	@Given("^login to the page \"([^\"]*)\" \"([^\"]*)\"$")
	public void loginToThePage(String url, String browser) {
		setBrowser(browser);
		actor.wasAbleTo(OpenPage.withTheUrl(url));
	}	
	@Then("^visualize the page$")
	public void visualizeThePage() {

	}

	
}
