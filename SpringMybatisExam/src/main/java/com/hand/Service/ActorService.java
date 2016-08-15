package com.hand.Service;

import java.util.List;

import com.hand.Entity.Actor;

public interface ActorService {
	public List<Actor> getAllActors();
	public Actor findById(int id);
	public void say();
	public void addActor(Actor a);
	 public void deleteActor(int id);
}
