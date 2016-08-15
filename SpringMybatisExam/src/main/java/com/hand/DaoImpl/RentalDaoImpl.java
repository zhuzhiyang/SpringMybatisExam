package com.hand.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.Dao.RentalDao;

@Repository("rentalDao")
public class RentalDaoImpl extends SqlSessionDaoSupport implements RentalDao {
@Autowired
public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
	// TODO Auto-generated method stub
	super.setSqlSessionFactory(sqlSessionFactory);
}
	public void deleteRental(int id) {
		getSqlSession().delete("com.hand.Entity.Rental.mapper.deleteRental", id);
		
	}

}
