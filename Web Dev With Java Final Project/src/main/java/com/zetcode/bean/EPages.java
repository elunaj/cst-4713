package com.zetcode.bean;

import java.util.Optional;
import java.util.stream.Stream;

public enum EPages {
	
	ALL_CITIES("cities", "/WEB-INF/allCities.jsp"),
	ALL_CITIES_PIE_CHART("citychart", "/WEB-INF/allCitiesPieChart.jsp"),
	UNKNOWN("unknown", "/WEB-INF/unknown.jsp"),
	UPDATE_CITIES("update", "/WEB-INF/allCities.jsp"),
	START_PAGE("start", "/WEB-INF/_startPage.jsp"),
	LOGIN_PAGE("login", "/WEB-INF/login.jsp"), 
	INVALID_LOGIN("invalid", "/WEB-INF/invalid.html" ), 
	LOGOUT_PAGE("logout", "/WEB-INF/logout.jsp"),
	CAR_LIST("listcars", "/WEB-INF/allCars.jsp"),
	CAR_LOAN("loan", "/WEB-INF/carLoan.jsp"),
	GROUP_PAGE("AB", "/WEB-INF/group.jsp"),
	GROUP_PAGE2("DC", "/WEB-INF/group.jsp"),
	GROUP_PAGE3("EF", "/WEB-INF/group.jsp"),
	GROUP_PAGE4("GG", "/WEB-INF/group.jsp"),
	GROUP_PAGE5("HK", "/WEB-INF/group.jsp"),
	GROUP_PAGE6("LM", "/WEB-INF/group.jsp"),
	GROUP_PAGE7("OP", "/WEB-INF/group.jsp"),
	GROUP_PAGE8("QR", "/WEB-INF/group.jsp"),
	GROUP_PAGE9("ST", "/WEB-INF/group.jsp"),
	GROUP_PAGE10("UV", "/WEB-INF/group.jsp"),
	GROUP_PAGE11("WX", "/WEB-INF/group.jsp"),
	;

	private String pageCode;
	private String pageName;

	EPages(String pageCode, String pageName) {
		this.pageCode = pageCode;
		this.pageName = pageName;
	}
	
	public String getPageCode() {
		return pageCode;
	}

	public String getPageName() {
		return pageName;
	}
	
	public static EPages find(String pageCode) {
		EPages[] pages = EPages.values();
		Stream<EPages> stream = Stream.of(pages);
	
		Optional<EPages> page = stream.filter(e -> e.pageCode.equalsIgnoreCase(pageCode))
							.findFirst();
		
		return page.orElseGet(() -> UNKNOWN);
		
	}

	@Override
	public String toString() {
		return "EPages [pageCode=" + pageCode + ", pageName=" + pageName + "]";
	}	

}
