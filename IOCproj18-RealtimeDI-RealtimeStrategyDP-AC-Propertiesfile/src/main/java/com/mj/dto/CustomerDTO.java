package com.mj.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	private String CustName;
	private String CustAddrs;
	private Float pamt;
	private Float rate;
	private Float time;
	//alt+shift+s,r
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public String getCustAddrs() {
		return CustAddrs;
	}
	public void setCustAddrs(String custAddrs) {
		CustAddrs = custAddrs;
	}
	public Float getPamt() {
		return pamt;
	}
	public void setPamt(Float pamt) {
		this.pamt = pamt;
	}
	public Float getRate() {
		return rate;
	}
	public void setRate(Float rate) {
		this.rate = rate;
	}
	public Float getTime() {
		return time;
	}
	public void setTime(Float time) {
		this.time = time;
	}
	//alt+shift+s,s
	@Override
	public String toString() {
		return "CustomerDTO [CustName=" + CustName + ", CustAddrs=" + CustAddrs + ", pamt=" + pamt + ", rate=" + rate
				+ ", time=" + time + "]";
	}
	
}
