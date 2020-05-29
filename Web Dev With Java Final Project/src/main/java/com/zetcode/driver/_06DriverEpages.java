package com.zetcode.driver;

import com.zetcode.bean.EPages;

public class _06DriverEpages {

	public static void main(String[] args) {
		
		EPages x = EPages.find("csdities");
		
		System.out.println(x);
	}
}
