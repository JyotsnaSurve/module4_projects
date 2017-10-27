package com.cg.emp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.emp.dtos.CustomerBean;

@Repository
@Transactional
public class CustDaoImpl implements ICustDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public CustomerBean addCust(CustomerBean cust) {
		if(cust!=null){
			entityManager.persist(cust);
			entityManager.flush();
		}
		return cust;
	}


	@Override
	public ArrayList<CustomerBean> getAllCustomer() {
		
		TypedQuery<CustomerBean> query = entityManager.createQuery("SELECT cb FROM CustomerBean cb", CustomerBean.class);
		return (ArrayList<CustomerBean>) query.getResultList();
	}


	@Override
	public CustomerBean getById(int id) {
		CustomerBean bean=new CustomerBean();
		bean=entityManager.find(CustomerBean.class, id);
		return bean;
	}


	@Override
	public boolean delete(int custId) {
		CustomerBean bean = getById(custId);
		entityManager.remove(bean);
		entityManager.flush();
		return true;
	}


	@Override
	public CustomerBean updateCustomer(CustomerBean bean) {
		if(bean!=null){
			bean = entityManager.merge(bean);
			entityManager.flush();
		}
		return bean;
	}


	@Override
	public ArrayList<Integer> getId() {
		/*TypedQuery<Integer> query = entityManager.createQuery("SELECT custId FROM CustomerBean cb", Integer.class);
		ArrayList<Integer>idlist=(ArrayList<Integer>) query.getResultList();
		return idlist;*/
		Query q=entityManager.createNamedQuery("getAllIds");
		return (ArrayList<Integer>) q.getResultList();

		}
}
