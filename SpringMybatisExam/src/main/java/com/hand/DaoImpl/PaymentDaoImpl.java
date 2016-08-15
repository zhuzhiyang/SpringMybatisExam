package com.hand.DaoImpl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.Dao.PaymentDao;
@Repository("paymentDao")
public class PaymentDaoImpl extends SqlSessionDaoSupport implements PaymentDao {
@Autowired
public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
	// TODO Auto-generated method stub
	super.setSqlSessionFactory(sqlSessionFactory);
}
	public void deletePayment(int id) {
		getSqlSession().delete("com.hand.Entity.Payment.mapper.deletePayment", id);
		
	}

}
