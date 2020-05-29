package com.zetcode.bean;

public class Loan {
	
	private int id;
	private float monthlyPayment;
	private float financeAmount;
	
	public Loan(int id, float monthlyPayment, float financeAmount) {
		super();
		this.id = id;
		this.monthlyPayment = monthlyPayment;
		this.financeAmount = financeAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(float monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	public float getFinanceAmount() {
		return financeAmount;
	}

	public void setFinanceAmount(float financeAmount) {
		this.financeAmount = financeAmount;
	}

	@Override
	public String toString() {
		return "Loan [id=" + id + ", monthlyPayment=" + monthlyPayment + ", financeAmount=" + financeAmount + "]";
	}
	
}
