package net.poc.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class chrometask  implements Task {
	Target bookbtn=Target.the("bookbtn").locatedBy("//img[@alt='Second car']");
	Target username=Target.the("user").located(By.id("username"));
	Target password=Target.the("user").located(By.id("password"));
	Target loginbtn=Target.the("user").locatedBy("//*[text()='Login']");
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(bookbtn),
				Enter.theValue("tharindugtetest3").into(username),
				Enter.theValue("tharindu1234").into(password),
				Click.on(loginbtn));
	}
	
	public static Performable to() {
        return instrumented(chrometask.class);
    }
}
