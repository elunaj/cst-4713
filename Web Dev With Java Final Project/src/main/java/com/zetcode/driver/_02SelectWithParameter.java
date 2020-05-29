package com.zetcode.driver;

import java.util.List;

import com.jbbwebsolutions.utility.ESQL;
import com.jbbwebsolutions.utility.SQLExecutable;
import com.jbbwebsolutions.utility.SQLUtility;
import com.zetcode.bean.Car;

public class _02SelectWithParameter {

	public static void main(String[] args) {
		
		String sql = " SELECT ID, NAME, PRICE, VENDORPRICE" +
		" FROM APP.CARS "
		+ " WHERE ID = ? ";
		
		String url = "jdbc:derby://localhost:1527/carsDB"
				+ ";user=app;password=password1234";
		
		SQLExecutable<Car> executable = rs -> {
			
			Long id = rs.getLong("ID");
			String name = rs.getString("NAME");
			float price = rs.getFloat("PRICE");
			float vendorPrice = rs.getFloat("PRICE");
			float profit = rs.getFloat("PRICE") - rs.getFloat("VENDORPRICE");
			
			return new Car(id, name, price, vendorPrice, profit);
		};
		 
		List<Car> cars = SQLUtility.execute(sql, url, ESQL.CONNECTION, executable, 10);
		
		cars.forEach(System.out::println);
	}

}
