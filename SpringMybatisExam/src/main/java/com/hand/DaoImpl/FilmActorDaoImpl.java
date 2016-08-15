package com.hand.DaoImpl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.Dao.FilmActorDao;
import com.hand.Entity.FilmActor;
@Repository("filmActorDao")
public class FilmActorDaoImpl extends SqlSessionDaoSupport implements FilmActorDao {
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated method stub
		super.setSqlSessionFactory(sqlSessionFactory);
	} 
	public FilmActor getAllActorbyfilmid(int id)
	 {
		 return getSqlSession().selectOne("com.hand.Entity.FilmActor.mapper.getAllActorbyfilmid",id);
	 }
}
