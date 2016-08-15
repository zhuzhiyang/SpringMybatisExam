package com.hand.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.Dao.PaymentDao;
import com.hand.Service.PaymentService;
@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {
 @Autowired
	private PaymentDao paymentDao;
	public void deletePayment(int id) {
		paymentDao.deletePayment(id);
	}
	public PaymentDao getPaymentDao() {
		return paymentDao;
	}
	public void setPaymentDao(PaymentDao paymentDao) {
		this.paymentDao = paymentDao;
	}

}
