package com.mj.service;

import com.mj.bo.CustomerBO;
import com.mj.dao.ICustomerDAO;
import com.mj.dto.CustomerDTO;

public final class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	private ICustomerDAO dao;//HAS-A property
	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		System.out.println("CustomerMgmtServiceImpl 1-param const");
		this.dao=dao;
	}
	@Override
	public String calculateSimpleIntrest(CustomerDTO dto) throws Exception {
		// calculate simple interest amount
		float intAmt=(dto.getPamt()*dto.getRate()*dto.getTime())/100.0f;
		//create BO class obj having persistable data
		CustomerBO bo=new CustomerBO();
		bo.setCustName(dto.getCustName());
		bo.setCustAddrs(dto.getCustAddrs());
		bo.setPamt(dto.getPamt());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setIntrestAmount(intAmt);
		//use dao
		int count=dao.insert(bo);
		return count==1?"Customer registered successfully-->Simple intrest amount::"+intAmt:"Customer registration failed";
	}

}
