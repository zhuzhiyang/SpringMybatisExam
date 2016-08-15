package com.hand.Service;

import com.hand.Entity.Customer;

public interface CustomerService {
	public void addCustomer(Customer c);
	public Customer findById(int id);
	public void deleteCustomer(int id);
}
