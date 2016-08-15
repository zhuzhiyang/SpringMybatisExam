package com.hand.ServiceImpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.Dao.ActorDao;

import com.hand.Entity.Actor;
import com.hand.Service.ActorService;
@Service("actorService")
public class ActorServiceImpl implements ActorService {
	@Autowired
	 private ActorDao actorDao;
   public List<Actor> getAllActors()
   {
	    
	   return actorDao.getAllActors();
   }
   public Actor findById(int id){   
	   return actorDao.findById(id);
   }
   public void addActor(Actor a){
	 
	   actorDao.addActor(a);
   }
   public void deleteActor(int id)
   {      
	   actorDao.deleteActor(id);
   }
   public void say(){
	   actorDao.say();
   }
public ActorDao getActorDao() {
	return actorDao;
}
public void setActorDao(ActorDao actorDao) {
	this.actorDao = actorDao;
}


}
