package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.cg.bean.Customer;

@Repository
@Transactional
public class CustDaoImpl implements ICustDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Customer addCust(Customer cust) {
		if(cust!=null){
			entityManager.persist(cust);
			entityManager.flush();
		}
		return cust;
	}

}
