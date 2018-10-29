package net.poc.interactions;

import java.util.List;

import io.appium.java_client.ios.IOSElement;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class getpartnerlist  implements Interaction {
    private Target target;

	@Step("{0} fetch list of partners")
	@Override
	public <T extends Actor> void performAs(T actor) {
//		System.out.println("Count of Arrows:");
//		List<WebElementFacade> t=BrowseTheWeb.as(actor).findAll(By.xpath("//*[@name='Food']"));
//		System.out.println("Target count is: " + t.size());
//		System.out.printf("%n" + "TAG name is: " + t.get(0).getTagName());
//		t.get(0).click();
		
		List<WebElementFacade> PartnerList= BrowseTheWeb.as(actor).findAll(By.xpath("//*[contains(@name,'arrow')]"));
		System.out.println("Partner List Count: " + PartnerList.size());
	}

	public getpartnerlist(Target target) {
        this.target = target;
    }


	public getpartnerlist() {}
	
	
	private Question<Boolean> theNextButtonIsVisible() {
        return actor -> target.resolveFor(actor).isCurrentlyVisible();
    }
}
