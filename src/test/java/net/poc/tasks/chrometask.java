package net.poc.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class chrometask  implements Task {
	Target bookbtn=Target.the("bookbtn").locatedBy("//img[@alt='Second car']");

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(bookbtn));
	}
	
	public static Performable to() {
        return instrumented(chrometask.class);
    }
}
