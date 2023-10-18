package com.mj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.mj.dto.CustomerDTO;
import com.mj.service.ICustomerMgmtService;
import com.mj.vo.CustomerVO;
@Controller("controller")
public class MainController {
	@Autowired
	@Qualifier("custService")
	private ICustomerMgmtService service;

	public String processCustomer(CustomerVO vo) throws Exception {
		//convert VO class object data to dto class object data
		CustomerDTO dto=new CustomerDTO();
		dto.setCustAddrs(vo.getCustAddrs());
		dto.setCustName(vo.getCustName());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));

		//use service
		String result=service.calculateSimpleIntrest(dto);
		return result;

	}
}
