package com.hand.Dao;

import java.util.List;

import com.hand.Entity.Actor;

public interface ActorDao {
public List<Actor> getAllActors();
public Actor findById(int id);
public void say();
public void addActor(Actor a);
public void deleteActor(int id);

}
