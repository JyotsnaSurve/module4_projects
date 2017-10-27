package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.bean.Customer;
import com.cg.dao.ICustDao;

public class CustServiceImpl implements ICustService {

	@Autowired
	private ICustDao custDao;
	

	@Override
	public Customer addCust(Customer cust) {
		return custDao.addCust(cust);
	}

}
