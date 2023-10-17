package com.mj.comp;

public final class FedX implements Courier{
	public FedX() {
		System.out.println("FedX::0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		return "delevering order id: "+oid+" ordered products through FedX";
	}
	
}
