package com.hand.ServiceImpl;

import javax.management.relation.RelationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.Dao.CustomerDao;
import com.hand.DaoImpl.CustomerDaoImpl;
import com.hand.Entity.Customer;
import com.hand.Service.CustomerService;
import com.hand.Service.PaymentService;
import com.hand.Service.RentalSercvice;
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;
	@Autowired	
    private PaymentService paymentService;
    @Autowired
    private RentalSercvice rentalService;
	
	public void addCustomer(Customer c){
    	customerDao.addCustomer(c);
		Customer customer=customerDao.findById(c.getCustomer_id());
        System.out.println("已经保存的数据如下:"+customer.toString());
	}
	public Customer findById(int id){
		return customerDao.findById(id);
	}


	public void deleteCustomer(int id) {
		rentalService.deleteRental(id);
		paymentService.deletePayment(id);
		customerDao.deleteCustomer(id);
	}
	public CustomerDao getCustomerDao() {
		return customerDao;
	}
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	public PaymentService getPaymentService() {
		return paymentService;
	}
	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	public RentalSercvice getRentalService() {
		return rentalService;
	}
	public void setRentalService(RentalSercvice rentalService) {
		this.rentalService = rentalService;
	}
	

}
