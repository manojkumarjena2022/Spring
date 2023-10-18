package com.mj.comp;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements Courier{
	public DTDC() {
		System.out.println("DTDC::0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		return "delevering order id: "+oid+" ordered products through DTDC";
	}
	
}
