package com.cg.emp.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.emp.dtos.CustomerBean;

public interface ICustDao {

	public CustomerBean addCust(CustomerBean cust);

	public ArrayList<CustomerBean> getAllCustomer();

	public CustomerBean getById(int id);

	public boolean delete(int custId);

	public CustomerBean updateCustomer(CustomerBean bean);

	public ArrayList<Integer> getId();

}
