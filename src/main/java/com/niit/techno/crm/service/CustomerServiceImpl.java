package com.niit.techno.crm.service;
import com.niit.techno.crm.dao.CustomerDAO;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.techno.crm.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	
	
	
	@Transactional
	public List<Customer> getCustomers()
	{
		return customerDAO.getCustomers();
	}
	
	@Transactional
	public void saveCustomer(Customer theCustomer) {

		customerDAO.saveCustomer(theCustomer);

	}

}
