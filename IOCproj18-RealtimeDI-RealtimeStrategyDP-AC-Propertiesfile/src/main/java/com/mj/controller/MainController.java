package com.mj.controller;

import com.mj.dto.CustomerDTO;
import com.mj.service.ICustomerMgmtService;
import com.mj.vo.CustomerVO;

public class MainController {
	private ICustomerMgmtService service;
	public MainController(ICustomerMgmtService service) {
		System.out.println("MainController : 1-param const");
		this.service=service;
	}
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
