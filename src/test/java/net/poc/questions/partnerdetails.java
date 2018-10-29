package net.poc.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class partnerdetails {
	String partnervariable=null;	
	int amt=0;
	//"//*[@name='Select Catering Services Pte Ltd']/preceding-sibling::*[contains(@name,'S$')]"
	public partnerdetails(String getname){
		partnervariable=getname;
	}
	
	public partnerdetails(int amt,String getname){
		this.amt=amt;
		this.partnervariable=getname;
	}
	
	public Question<String> thePartnerName() {
		Target partnername=Target.the("partnername").locatedBy("//*[@name='"+partnervariable+"']");
        return actor -> partnername.resolveFor(actor).getText();
    }
	
	public Question<Double> theAmt() {
		Target amt=Target.the("amt").locatedBy("//*[@name='"+partnervariable+"']/preceding-sibling::*[contains(@name,'S$')]");
        return actor -> Double.parseDouble(amt.resolveFor(actor).getText().split("\\$")[1].trim().split(" ")[0]);
    }
}
