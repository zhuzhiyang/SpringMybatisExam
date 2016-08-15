package com.hand.Util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisSession {
     private static MybatisSession mybatissession;
     private MybatisSession(){}
     public static  MybatisSession getmybatissesion(){
    	if( mybatissession==null)
    		{
    		mybatissession=new MybatisSession();
    		}
    	return mybatissession;
    	}
	
	public SqlSession getSession(){
		Reader reader=null;
		try {
			reader = Resources.getResourceAsReader("com/hand/map/MyBatisConfig.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	    SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
	    SqlSession session =factory.openSession(true);
	    return session;
		
	}	
	
	
}
