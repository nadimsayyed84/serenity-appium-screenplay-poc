package net.poc.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.hamcrest.Matcher;

import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class Start implements Task{
	Target partnercatagory = Target.the("partnercatagory").locatedBy("//*[@name='Food']");
	Target next = Target.the("next").locatedBy("//*[@name='NEXT']");
	static Target getstarted = Target.the("getstarted").locatedBy("//*[@name='GET STARTED']");
	String getstarttext="GET STARTED";
	@Step("{0} Clicking Partner catagories @SP services")
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		
		actor.attemptsTo(
//				Enter.theValue(stationName).into(stationDropdown),
				Click.on(next),
				Click.on(next),
				Click.on(next),
//				Check.whether(gettingstartbtn(), containsText(getstarttext)).Click.on(getstarted),
				Check.whether(thePartnercatagoryIsVisible()).andIfSo(Click.on(partnercatagory)));
	}

	private Question<Boolean> thePartnercatagoryIsVisible() {
        return actor -> partnercatagory.resolveFor(actor).isCurrentlyVisible();
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
