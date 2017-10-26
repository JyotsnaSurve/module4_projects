package com.cg.emp.service;

import java.util.ArrayList;

import com.cg.emp.dtos.CustomerBean;

public interface ICustService {

	public CustomerBean addCust(CustomerBean bean);

	public ArrayList<CustomerBean> getAllCustomer();

	public CustomerBean getById(int id);

	public boolean delete(int custId);

	public CustomerBean updateCustomer(CustomerBean bean);

	public ArrayList<Integer> getId();

}
