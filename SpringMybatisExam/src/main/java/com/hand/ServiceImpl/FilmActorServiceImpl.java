package com.hand.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.Dao.FilmActorDao;
import com.hand.DaoImpl.FilmActorDaoImpl;
import com.hand.Entity.FilmActor;
import com.hand.Service.FilmActorService;
@Repository("filmActorService")
public class FilmActorServiceImpl implements FilmActorService {
	@Autowired
	private FilmActorDao filmActorDao;
	
	public FilmActor getAllActorbyfilmid(int id)
	{
		return filmActorDao.getAllActorbyfilmid(id);
	}

	public FilmActorDao getFilmActorDao() {
		return filmActorDao;
	}

	public void setFilmActorDao(FilmActorDao filmActorDao) {
		this.filmActorDao = filmActorDao;
	}
}
