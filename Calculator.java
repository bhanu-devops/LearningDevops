package com.rms.test;

public class Calculator {
	public double add(double a, double b) {
		return a+b;
		//System.out.println("Add value is : " + );
	}
	public double substract(double a, double b) {
		return a-b;
	}
	public double divide(double a, double b) {
		return a/b;
		
		/*if(a>= b) {
			double result = a/b;
		return result;
		}else {
			double dble  = a/b;
			return dble;
		}*/
	}             
	public double multiply(double a, double b) {
		return a*b;
	}
}
