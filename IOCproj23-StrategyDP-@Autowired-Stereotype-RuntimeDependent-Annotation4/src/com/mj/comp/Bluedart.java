package com.mj.comp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bluedart")
//@Scope("prototype")
public final class Bluedart implements Courier{
	public Bluedart() {
		System.out.println("Bluedart::0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		return "delevering order id: "+oid+" ordered products through FedX";
	}
	
}
