package com.zetcode.persistence;

import static com.zetcode.util.GLOBAL.DB_URL;

import java.util.List;

import com.jbbwebsolutions.dao.IQuery;
import com.jbbwebsolutions.dao.IUpdate;
import com.jbbwebsolutions.utility.ESQL;
import com.jbbwebsolutions.utility.SQLExecutable;
import com.jbbwebsolutions.utility.SQLUtility;
import com.zetcode.bean.Group;

public class GroupDAO implements IQuery<Group>, IUpdate<Group> {

	@Override
	public List<Group> findAll() {
		
		String sql = "SELECT * FROM APP.VW_4THQUARTERBYGROUP";
		
		SQLExecutable<Group> executable = rs -> {
			
			String group = rs.getString("GROUPID");
			String name = rs.getString("NAME");
			String cityId = rs.getString("CITYID");
			String purchaseMonth = rs.getString("PURCHASEMONTH");
			float pricePaid = rs.getFloat("PRICEPAID");
			float vendorPrice = rs.getFloat("VENDORPRICE");
			float income = rs.getFloat("INCOME");
			
			return new Group(group, name, cityId, purchaseMonth, pricePaid, vendorPrice, income);
		};			
			 
		List<Group> group = SQLUtility.execute(sql, DB_URL, ESQL.CONNECTION, executable);
		
		return group;
				
	}
	
	public List<Group> findByPageCode(String pageCode) {
		
		String sql = "SELECT * FROM APP.VW_4THQUARTERBYGROUP "
				+ " WHERE GROUPID = ? ";
		
		SQLExecutable<Group> executable = rs -> {
			
			String group = rs.getString("GROUPID");
			String name = rs.getString("NAME");
			String cityId = rs.getString("CITYID");
			String purchaseMonth = rs.getString("PURCHASEMONTH");
			float pricePaid = rs.getFloat("PRICEPAID");
			float vendorPrice = rs.getFloat("VENDORPRICE");
			float income = rs.getFloat("INCOME");
			
			return new Group(group, name, cityId, purchaseMonth, pricePaid, vendorPrice, income);
		};			
			 
		List<Group> group = SQLUtility.execute(sql, DB_URL, ESQL.CONNECTION, executable, pageCode);
		
		return group;
				
	}

	@Override
	public int save(Group model) {
		// TODO Auto-generated method stub
		return 0;
	}

}
