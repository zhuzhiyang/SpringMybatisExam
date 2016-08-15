package com.hand.Entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public class Actor implements Serializable{
private Integer actor_id;
private String first_name;
private String last_name;
private Timestamp last_update;
private List<FilmActor> filmactors;
private FilmActor filmactor;
public Integer getActor_id() {
	return actor_id;
}
public void setActor_id(Integer actor_id) {
	this.actor_id = actor_id;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}

public void getName(){
	System.out.println(this.getFirst_name());
}
public Timestamp getLast_update() {
	return last_update;
}
public void setLast_update(Timestamp last_update) {
	this.last_update = last_update;
}
public List<FilmActor> getFilmactors() {
	return filmactors;
}
public void setFilmactors(List<FilmActor> filmactors) {
	this.filmactors = filmactors;
}
public FilmActor getFilmactor() {
	return filmactor;
}
public void setFilmactor(FilmActor filmactor) {
	this.filmactor = filmactor;
}
@Override
	public String toString() {
		
		return "{actor_id="+actor_id+"first_name="+first_name+"last_name="+last_name+"last_update="+last_update+"}";
	}
}
