package com.zetcode.driver;

import java.util.ArrayList;
import java.util.List;

import com.zetcode.bean.Loan;

public class formulaDriver {
	
	public static float calculateLoan(float annualRate, float term, float financeAmount) {
		
		
		annualRate = annualRate/100;
		
		double fv = financeAmount * Math.pow((1 + annualRate/12), term);
		double monthlyPayment = (fv * annualRate/12) / (Math.pow((1 + annualRate/12), term) - 1);
		
		
		return (float) monthlyPayment;
	}
	
	public static void main(String[] args) {
		
		float finA = 1_000_000f;
		float term = 60f;
		float rate = 5f;
		
		List<Loan> loans = new ArrayList<>();
		
		for (int i = 0; i < 25; i++) {
			
			float monthlyPayment = calculateLoan(rate, term, finA);
			
			loans.add(new Loan(i + 1, monthlyPayment, finA ));
			
			finA += 500;
			
		}
		
		
		loans.forEach(System.out::println);
		
	}
	

}
