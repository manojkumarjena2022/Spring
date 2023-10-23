package com.mj.vo;

public class CustomerVO {
	private String CustName;
	private String CustAddrs;
	private String pamt;
	private String rate;
	private String time;
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
	public String getPamt() {
		return pamt;
	}
	public void setPamt(String pamt) {
		this.pamt = pamt;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	//alt+shift+s,s
	@Override
	public String toString() {
		return "CustomerVO [CustName=" + CustName + ", CustAddrs=" + CustAddrs + ", pamt=" + pamt + ", rate=" + rate
				+ ", time=" + time + "]";
	}
	
	
	
}
