package com.zetcode.service;

import java.util.List;

import com.jbbwebsolutions.service.IService;
import com.zetcode.bean.City;
import com.zetcode.persistence.CityDAO;

public class CityService implements IService<City> {

	@Override
	public List<City> findAll() {
		CityDAO cityDAO = new CityDAO();
		return cityDAO.findAll();
	}

	@Override
	public void save(City model) {
		CityDAO cityDao = new CityDAO();
		cityDao.save(model);
	}

}
