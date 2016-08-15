package com.hand.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.Dao.RentalDao;
import com.hand.DaoImpl.RentalDaoImpl;
import com.hand.Service.RentalSercvice;
@Service("rentalSercvice")
public class RentalSercviceImpl implements RentalSercvice {
  @Autowired
	private RentalDao rentalDao;
	public void deleteRental(int id) {
		rentalDao.deleteRental(id);
	}
	public RentalDao getRentalDao() {
		return rentalDao;
	}
	public void setRentalDao(RentalDao rentalDao) {
		this.rentalDao = rentalDao;
	}
	
	
}
