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
    private final Target target;

	@Step("{0} fetch list of partners")
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
//		List<IOSElement> PartnerList= driver.findElements(By.xpath("//*[contains(@name,'arrow')]"));
//		System.out.println("Partner List Count: " + PartnerList.size());
//		List<Target> t=(List<Target>) Target.the("arrow").locatedBy("//*[contains(@name,'arrow')]");
		System.out.println("Count of Arrows:");
		List<WebElementFacade> t=BrowseTheWeb.as(actor).findAll(By.xpath("//*[@name='Food']"));
		System.out.println("Target count is: " + t.size());
		System.out.printf("%n" + "TAG name is: " + t.get(0).getTagName());
//		System.out.println("TAG name is: " + t.get(0).getTagName());
		t.get(0).click();
//		System.out.println("Target element name is: " + target.getName());
//		actor.attemptsTo(Check.whether(theNextButtonIsVisible()));
	}

	public getpartnerlist(Target target) {
        this.target = target;
    }

	private Question<Boolean> theNextButtonIsVisible() {
        return actor -> target.resolveFor(actor).isCurrentlyVisible();
    }
}
