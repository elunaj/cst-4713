package com.zetcode.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zetcode.bean.EPages;
import com.zetcode.bean.Group;
import com.zetcode.service.GroupService;
import com.zetcode.util.GLOBAL;

@WebServlet("/group")
public class GroupController extends AbstractSecurityController {
	
	private static final long serialVersionUID = 1L;
	

	protected void securedGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String pageCode = request.getParameter(GLOBAL.ACTION);
		EPages epage = EPages.find(pageCode);
		
//		try{
//		    Class.forName("org.apache.derby.jdbc.ClientDriver");
//		} catch(ClassNotFoundException e){
//		    //handle exception
//		}
		
		if (epage == EPages.GROUP_PAGE || epage == EPages.GROUP_PAGE2 || epage == EPages.GROUP_PAGE3
				|| epage == EPages.GROUP_PAGE4 || epage == EPages.GROUP_PAGE5 || epage == EPages.GROUP_PAGE6
				|| epage == EPages.GROUP_PAGE7 || epage == EPages.GROUP_PAGE8 || epage == EPages.GROUP_PAGE9
				|| epage == EPages.GROUP_PAGE10 || epage == EPages.GROUP_PAGE11) {
			
			GroupService service = new GroupService();
			
			List<Group> list = new ArrayList<Group>();
				
			list = service.findByPageCode(pageCode);
			DoubleSummaryStatistics summary = service.getSummary(list, Group::getIncome);
				
		    request.setAttribute("groupList", list);
		    request.setAttribute("average", summary.getAverage());
		    request.setAttribute("total", summary.getSum());
		    request.setAttribute("pagecode", pageCode);
			
		}
			

			
        RequestDispatcher disp = 
	       		 getServletContext()
	       		.getRequestDispatcher("/" + 
	       		 epage.getPageName());
		
       disp.forward(request, response);
		
	}

}
