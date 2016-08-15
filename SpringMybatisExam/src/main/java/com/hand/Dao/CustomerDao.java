package com.hand.Dao;

import com.hand.Entity.Customer;

public interface CustomerDao {
	public void addCustomer(Customer c);
	public Customer findById(int id);
	public void deleteCustomer(int id);
}
