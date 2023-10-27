package com.bnt.dto;

public class CalculatorResponse {

	private double num1;
	private String num2;
	
	public CalculatorResponse(double num1, String num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public CalculatorResponse() {
		super();
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public String getNum2() {
		return num2;
	}
	public void setNum2(String num2) {
		this.num2 = num2;
	}
	
	
	
}
