package com.hand.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.Dao.CustomerDao;
import com.hand.Entity.Customer;


@Repository("customerDao")
public class CustomerDaoImpl  extends SqlSessionDaoSupport implements CustomerDao {
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	public void addCustomer(Customer c) {
		getSqlSession().insert("com.hand.Entity.Customer.mapper.addCustomer", c);
	}
	public Customer findById(int id) {
		return getSqlSession().selectOne("com.hand.Entity.Customer.mapper.findById",id);
	}
	public void deleteCustomer(int id) {
		getSqlSession().delete("com.hand.Entity.Customer.mapper.deleteCustomer", id);
	}
	
	

}
