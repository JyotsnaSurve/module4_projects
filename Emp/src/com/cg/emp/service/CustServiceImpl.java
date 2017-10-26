package com.cg.emp.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.emp.dao.ICustDao;
import com.cg.emp.dtos.CustomerBean;


@Service
public class CustServiceImpl implements ICustService{

	@Autowired
	private ICustDao custDao;
	
	
	public ICustDao getCustDao() {
		return custDao;
	}


	public void setCustDao(ICustDao custDao) {
		this.custDao = custDao;
	}


	@Override
	public CustomerBean addCust(CustomerBean cust) {
		return custDao.addCust(cust);
	}


	@Override
	public ArrayList<CustomerBean> getAllCustomer() {
		return custDao.getAllCustomer();
	}


	/*@Override
	public CustomerBean getById(CustomerBean cust) {
		return custDao.getById(cust);

	}*/


	@Override
	public CustomerBean getById(int id) {
		return custDao.getById(id);
	}


	@Override
	public boolean delete(int custId) {
		return custDao.delete(custId);
	}



	@Override
	public CustomerBean updateCustomer(CustomerBean bean) {
		return custDao.updateCustomer(bean);
	}


	@Override
	public ArrayList<Integer> getId() {
		return custDao.getId();
	}

}
