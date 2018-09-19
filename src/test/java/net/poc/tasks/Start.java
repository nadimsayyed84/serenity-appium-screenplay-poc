package net.poc.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import net.poc.ui.NotesWelcomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class Start implements Task{

	@Step("{0} Clicking Partner catagories @SP services")
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		Target partnercatagory = Target.the("partnercatagory").locatedBy("//*[@name='Food']");
		Target next = Target.the("next").locatedBy("//*[@name='NEXT']");
		Target getstarted = Target.the("getstarted").locatedBy("//*[@name='GET STARTED']");
		
		actor.attemptsTo(
				Click.on(next),
				Click.on(next),
				Click.on(next),
				Click.on(getstarted),
				Click.on(partnercatagory));
	}

	 public static Start with() {
	        return instrumented(Start.class);
	    }
}
