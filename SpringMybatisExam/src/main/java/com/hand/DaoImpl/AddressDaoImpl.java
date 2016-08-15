package com.hand.DaoImpl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.Dao.AddressDao;
import com.hand.Entity.Address;
@Repository("addressDao")
public class AddressDaoImpl extends SqlSessionDaoSupport implements AddressDao {
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	public Address findById(int id) {
		
		return getSqlSession().selectOne("com.hand.Entity.Address.mapper.findById",id);
	}

}
