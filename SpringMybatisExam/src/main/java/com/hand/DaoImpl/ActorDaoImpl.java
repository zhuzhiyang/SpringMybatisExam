package com.hand.DaoImpl;

import java.io.IOException;
import java.io.Reader;
import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.Entity.Actor;
import com.hand.Util.MybatisSession;
import com.hand.Dao.ActorDao;


@Repository("actorDao")
public class ActorDaoImpl extends SqlSessionDaoSupport implements ActorDao {
//	private SqlSessionTemplate sqlSession;
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	public List<Actor> getAllActors() {
		
		return getSqlSession().selectList("com.hand.Entity.Actor.mapper.getAllActors");
            
	}
	public Actor findById(int id){
		
		return null;
	}
	public void addActor(Actor a){
		
		getSqlSession().insert("com.hand.Entity.Actor.mapper.addActor", a);
	}
	 public void deleteActor(int id){
		 getSqlSession().delete("com.hand.Entity.Actor.mapper.deleteActor", id);
	 }
	
	
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("123");
		
	}
}
