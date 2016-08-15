package com.hand.Entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class FilmActor implements Serializable {
private Integer actor_id;
private Integer film_id;
private Timestamp last_update;
private Actor actor;
public Integer getActor_id() {
	return actor_id;
}
public void setActor_id(Integer actor_id) {
	this.actor_id = actor_id;
}
public Integer getFilm_id() {
	return film_id;
}
public void setFilm_id(Integer film_id) {
	this.film_id = film_id;
}
public Timestamp getLast_update() {
	return last_update;
}
public void setLast_update(Timestamp last_update) {
	this.last_update = last_update;
}
public Actor getActor() {
	return actor;
}
public void setActor(Actor actor) {
	this.actor = actor;
}

}
