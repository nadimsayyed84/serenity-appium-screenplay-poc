package net.poc.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import org.hamcrest.Matcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnTarget;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class Start implements Task{
	Target partnercatagory = Target.the("partnercatagory").locatedBy("//*[@name='Food']");
	Target next = Target.the("next").locatedBy("//*[@name='NEXT']");
	static Target getstarted = Target.the("getstarted").locatedBy("//*[@name='GET STARTED']");
//	static Target Housekeeping = Target.the("category").locatedBy("//*[@name='House-keeping']");
//	static Target partnerlisting = Target.the("partnerlisting").locatedBy("//*[contains(text(),'House-keeping')]");
	String getstarttext="GET STARTED";

	@Step("{0} Clicking Partner catagories @SP services")
	@Override
	public <T extends Actor> void performAs(T actor) {
//		WebElement deleteButton = BrowseTheWeb.as(actor).findBy("//*[@name='NEXT']");
//		System.out.println(deleteButton.getAttribute("name"));
		actor.attemptsTo(
//				Enter.theValue(stationName).into(stationDropdown),
//				Enter.theValue(thingToDo).into(NewTodoForm.NEW_TODO_FIELD).thenHit(Keys.RETURN),
//				WaitUntil.the(next, isVisible()),
//				getpartner.partnerlist(next),
				Click.on(next),
				Click.on(next),
				Click.on(next),
//				WaitUntil.the(partnercatagory, isVisible()),
//				Check.whether(gettingstartbtn(), containsText(getstarttext)).Click.on(getstarted),
				Check.whether(thePartnercatagoryIsVisible()).andIfSo(Click.on(getstarted)),
				getpartner.partnerlist(next)//,
//				Click.on(partnerlisting)
				);
			
	}

	private Question<Boolean> thePartnercatagoryIsVisible() {
        return actor -> getstarted.resolveFor(actor).isCurrentlyVisible();
    }
	
	public static Question<String> gettingstartbtn() {
        return actor -> getstarted.resolveFor(actor).getText();
    }
	
//	private Matcher<String> theActstartText() {
//        return actor -> getstarttext;
//    }
	
	public static Start with() {
	        return instrumented(Start.class);
	}
}

