package net.poc.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.poc.interactions.getpartnerlist;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class getpartner {
	public static Interaction partnerlist(Target target) {
        return instrumented(getpartnerlist.class,target);
    }
}
