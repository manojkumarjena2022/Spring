package com.mj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mj.bo.CustomerBO;
import com.mj.dao.ICustomerDAO;
import com.mj.dto.CustomerDTO;
@Service("custMgmtService")
public final class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	@Autowired
	@Qualifier("custOracleDAO")
	//@Qualifier("custMySQLDAO")
	private ICustomerDAO dao;//HAS-A property
	
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
