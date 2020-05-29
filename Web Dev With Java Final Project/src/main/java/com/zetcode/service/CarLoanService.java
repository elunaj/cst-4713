package com.zetcode.service;

import com.jbbwebsolutions.dao.IQuery;
import com.jbbwebsolutions.dao.IUpdate;
import com.jbbwebsolutions.service.IService;
import com.jbbwebsolutions.service.IStatisticsService;
import com.zetcode.bean.Car;
import com.zetcode.bean.Loan;
import com.zetcode.persistence.CarDAO;

import java.util.ArrayList;
import java.util.List;

public class CarLoanService {

	public float calculateLoan(float annualRate, float term, float financeAmount) {
		
		annualRate = annualRate/100;
		
		double fv = financeAmount * Math.pow((1 + annualRate/12), term);
		double monthlyPayment = (fv * annualRate/12) / (Math.pow((1 + annualRate/12), term) - 1);
		
		
		return (float) monthlyPayment;
	}
	
	public List<Loan> loanScenarios(float annualRate, float term, float financeAmount, int iterations) {
		
		
		List<Loan> loans = new ArrayList<>();
		
		for (int i = 0; i < iterations; i++) {
			
			float monthlyPayment = calculateLoan(annualRate, term, financeAmount);
			
			loans.add(new Loan(i + 1, monthlyPayment, financeAmount));
			
			financeAmount += 500;
			
		}
		
		return loans;
	}
	
}
