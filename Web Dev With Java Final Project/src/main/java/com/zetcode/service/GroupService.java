package com.zetcode.service;

import java.util.List;

import com.jbbwebsolutions.dao.IQuery;
import com.jbbwebsolutions.service.IService;
import com.jbbwebsolutions.service.IStatisticsService;
import com.zetcode.bean.Group;
import com.zetcode.persistence.GroupDAO;

public class GroupService implements IService<Group>, IStatisticsService<Group> {

	@Override
	public List<Group> findAll() {
		GroupDAO groupDAO = new GroupDAO();
		return groupDAO.findAll();
	}

	public List<Group> findByPageCode(String pageCode) {
		GroupDAO groupDAO = new GroupDAO();
		return groupDAO.findByPageCode(pageCode);
	}

}
