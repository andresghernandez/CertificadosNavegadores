package com.certificados.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPage implements Task {

	private String url;
	
	public OpenPage(String url) {
		this.url = url;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.url(url));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static OpenPage withTheUrl(String url) {
		return Tasks.instrumented(OpenPage.class, url);
	}
}
