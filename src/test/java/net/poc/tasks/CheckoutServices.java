package net.poc.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.poc.model.Note;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class CheckoutServices implements Task {
	public String servicecategory=null;
	CheckoutServices(String servicecategory){
		this.servicecategory=servicecategory;
	}
	@Step("{0} select category")
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(
				Click.on(Target.the("category").locatedBy("//*[@name='"+servicecategory+"']"))
				);		
	}
	
    public static CheckoutServices with(String servicecategory) {
        return instrumented(CheckoutServices.class, servicecategory);
    }
}
