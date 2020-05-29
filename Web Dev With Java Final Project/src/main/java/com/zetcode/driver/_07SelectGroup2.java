package com.zetcode.driver;

import java.sql.Statement;
import java.util.List;

import com.jbbwebsolutions.utility.ESQL;
import com.jbbwebsolutions.utility.SQLExecutable;
import com.jbbwebsolutions.utility.SQLUtility;
import com.zetcode.bean.Car;
import com.zetcode.bean.City;
import com.zetcode.bean.Group;

import static com.zetcode.util.GLOBAL.DB_URL;

public class _07SelectGroup2 {

	public static void main(String[] args) {
		
		
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
		
		group.forEach(System.out::println);

	}

}
