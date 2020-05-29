package com.zetcode.web;

import static com.zetcode.bean.EPages.CAR_LOAN;
import static com.zetcode.util.GLOBAL.ACTION;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zetcode.bean.City;
import com.zetcode.bean.EPages;
import com.zetcode.bean.Loan;
import com.zetcode.service.CarLoanService;
import com.zetcode.service.CityService;

@WebServlet("/carloan")
public class CarLoanController extends AbstractSecurityController {
	private static final long serialVersionUID = 1L;
       
	
	protected void securedPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		CarLoanService service = new CarLoanService();
		List<Loan> scenarios = new ArrayList();
		
		String amount = request.getParameter("amount");
		String rate = request.getParameter("rate");
		String numOfScen = request.getParameter("numOfScen");
		
		float floatRate = Float.parseFloat(rate);
		float floatAmount = Float.parseFloat(amount);
		int intNumOfScen = Integer.parseInt(numOfScen);
		
		scenarios = service.loanScenarios(floatRate, 60f, floatAmount, intNumOfScen);
		
		request.setAttribute("scenarios", scenarios);
		request.setAttribute("firstCase", scenarios.get(0));
		
		 RequestDispatcher disp = 
			  getServletContext()
    		 .getRequestDispatcher("/" + 
    		 EPages.CAR_LOAN.getPageName());
		 

		 disp.forward(request, response);
		 
	}


	protected void securedGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String pageCode = request.getParameter(ACTION);
		EPages epage = EPages.find(pageCode);
		
		if (epage == CAR_LOAN) {
			
			CarLoanService service = new CarLoanService();
			List<Loan> scenarios = new ArrayList();
			
			scenarios = service.loanScenarios(5f, 60f, 1_000_000f, 25);
			
			request.setAttribute("scenarios", scenarios);
			request.setAttribute("firstCase", scenarios.get(0));
	
		}
		 
        RequestDispatcher disp = getServletContext()
        		.getRequestDispatcher("/" + epage.getPageName());
       
			disp.forward(request, response);
		
	}

}
