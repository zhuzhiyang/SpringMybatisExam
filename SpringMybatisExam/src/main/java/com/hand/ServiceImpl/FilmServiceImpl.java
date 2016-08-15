package com.hand.ServiceImpl;

import java.util.List;

import com.hand.Dao.FilmDao;
import com.hand.DaoImpl.FilmDaoImpl;
import com.hand.Entity.Film;
import com.hand.Service.FilmService;

public class FilmServiceImpl implements FilmService {
	FilmDao filmDao;

	public FilmDao getFilmDao() {
		return filmDao;
	}

	public void setFilmDao(FilmDao filmDao) {
		this.filmDao = filmDao;
	}
 public void say(){
	 System.out.println("hello spring");
 }
	
	
}
